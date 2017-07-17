import java.util.Random;
import weka.clusterers.SimpleKMeans;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
public class WekaCluster {
    public WekaCluster(String filepath) {
        try {

            Instances data = DataSource.read(filepath);
            int clusters = calculateRuleOfThumb(data.numInstances());
            System.out.println("Rule of Thumb Clusters = " + clusters);
            SimpleKMeans kMeans = new SimpleKMeans();
            kMeans.setNumClusters(clusters);
            kMeans.setSeed(42);
            kMeans.buildClusterer(data);
            showCentroids(kMeans, data);
            showInstanceInCluster(kMeans, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int calculateRuleOfThumb(int rows) {
        return (int)Math.sqrt(rows/2);
    }
    public void showCentroids(SimpleKMeans kMeans, Instances data) {
        Instances centroids = kMeans.getClusterCentroids();
        for (int i = 0; i < centroids.numInstances(); i++) {
            System.out.println("Centroid: " + i + ": " + centroids.
                    instance(i));
        }
    }
    public void showInstanceInCluster(SimpleKMeans kMeans, Instances
            data) {
        try {
            for (int i = 0; i < data.numInstances(); i++) {
                System.out.println("Instance " + i + " is in cluster "
                        + kMeans.clusterInstance(data.instance(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
// Pass the arff location and the number of clusters we want
        WekaCluster wc = new WekaCluster("dataset/housing.arff");
    }
}