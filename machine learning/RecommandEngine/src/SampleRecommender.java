import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Shabab on 11/12/2015.
 */
public class SampleRecommender {
    public static void main(String[] args) throws Exception {
       // DataModel model = new FileDataModel(new File("data/dataset.csv"));
        DataModel model = new FileDataModel(new File("data/ratings.csv"));
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
        UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);


        UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);


        List<RecommendedItem> recommendations = recommender.recommend(1, 5);
        for (RecommendedItem recommendation : recommendations) {
            System.out.println(recommendation);
        }


    }
}
