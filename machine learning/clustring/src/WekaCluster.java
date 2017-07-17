import weka.clusterers.SimpleKMeans;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.util.Random;

public class WekaCluster {
	public SimpleKMeans kMeans;
	public WekaCluster(String filepath, int clusters) {
		try {
			Instances data = DataSource.read(filepath);
			
			 kMeans = new SimpleKMeans();
			kMeans.setNumClusters(clusters);
			kMeans.buildClusterer(data);
			
			Instances centroids = kMeans.getClusterCentroids();
			for (int i = 0; i < centroids.numInstances(); i++) {
				System.out.println("Centroid: "+ i + ": " + centroids.instance(i));
			}
			
			for (int i = 0; i < data.numInstances(); i++) {
				System.out.println(i + " in cluster" + kMeans.clusterInstance(data.instance(i)));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// Pass the arff location and the number of clusters we want
		WekaCluster wc = new WekaCluster("input/kmeansdata2.arff", 6);

		wc.testRandomInstances(wc.kMeans);

	}
	public void testRandomInstances(SimpleKMeans kMeans) {
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			double x = rand.nextInt(200);
			double y = rand.nextInt(200);
			System.out.println(x + "/" + y + " test in cluster " +
					predictCluster(kMeans, x, y));
		}
	}
	public int predictCluster(SimpleKMeans kMeans, double x, double y) {
		int clusterNumber = -1;
		try {
			double[] newdata = new double[] { x, y };
			Instance testInstance = new Instance(1.0, newdata);
			clusterNumber = kMeans.clusterInstance(testInstance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clusterNumber;
	}

}
