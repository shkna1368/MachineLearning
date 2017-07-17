/*
import android.app.AlertDialog;
import android.util.Log;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestClassifier {
	*/
/*public static void main(String[] args) throws Exception {

*//*
*/
/*
		WekaWrapper ww = new WekaWrapper();
		try {
			*//*
*/
/**//*
*/
/*Instances unlabeled = new Instances(new BufferedReader(
					new FileReader("br.arff")));*//*
*/
/**//*
*/
/*
			Instances unlabeled = new Instances(new BufferedReader(
					new FileReader("breastti.arff")));
			unlabeled.setClassIndex(unlabeled.numAttributes() - 1);
			System.out.println(unlabeled +
					"");
			//Instance inst = new Instance(10);

		*//*
*/
/**//*
*/
/*	Attribute attr1 = new Attribute("clump_thickness numeric");
			Attribute attr2 = new Attribute("uniformity_of_cell_size");
			Attribute attr3 = new Attribute("uniformity_of_cell_shape");
			Attribute attr4 = new Attribute("marginal_adhersion");
			Attribute attr5 = new Attribute("single_epithelial");
			Attribute attr6 = new Attribute("bare_nucleoli");
			Attribute attr7 = new Attribute("bland_chromatin");
			Attribute attr8 = new Attribute("normal_nucleoli");
			Attribute attr9 = new Attribute("mitoses");
			Attribute attr10 = new Attribute("class");

// Set instance's values for the attributes "length", "weight", and "position"
			inst.setValue(attr1, 5);
			inst.setValue(attr2, 4);
			inst.setValue(attr3, 4);
			inst.setValue(attr4, 5);
			inst.setValue(attr5, 7);
			inst.setValue(attr6, 10);
			inst.setValue(attr7,3);
			inst.setValue(attr8, 2);
			inst.setValue(attr9, 1);
			inst.setValue(attr10, "?");

// Set instance's dataset to be the dataset "race"
		//	inst.setDataset(race);

// Print the instance
			System.out.println("The instance: " + inst);*//*
*/
/**//*
*/
/*


			for (int i = 0; i < unlabeled.numInstances(); i++) {
				double clsLabel = ww.classifyInstance(unlabeled.instance(i));
				System.out.println(i + "----" + clsLabel + " -> " + unlabeled.classAttribute().value((int) clsLabel));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*//*
*/
/*
		System.out.println("//////////////////////////////");
		test();
	}*//*


	public  void test() throws Exception {
		Attribute attr1 = new Attribute("clump_thickness");
		Attribute attr2 = new Attribute("uniformity_of_cell_size");
		Attribute attr3 = new Attribute("uniformity_of_cell_shape");
		Attribute attr4 = new Attribute("marginal_adhersion");
		Attribute attr5 = new Attribute("single_epithelial");
		Attribute attr6 = new Attribute("bare_nucleoli");
		Attribute attr7 = new Attribute("bland_chromatin");
		Attribute attr8 = new Attribute("normal_nucleoli");
		Attribute attr9 = new Attribute("irradiat");

		FastVector labels = new FastVector();
		labels.addElement("2");
		labels.addElement("4");
		Attribute cls = new Attribute("class", labels);

		FastVector attributes = new FastVector();
		attributes.addElement(attr1);
		attributes.addElement(attr2);
		attributes.addElement(attr3);
		attributes.addElement(attr4);
		attributes.addElement(attr5);
		attributes.addElement(attr6);
		attributes.addElement(attr7);
		attributes.addElement(attr8);
		attributes.addElement(attr9);


		attributes.addElement(cls);


		Instances dataset = new Instances("Test-dataset", attributes, 0);

		double[] attValues1 = new double[dataset.numAttributes()];
		double[] attValues2 = new double[dataset.numAttributes()];
		double[] attValues3 = new double[dataset.numAttributes()];

		//5,4,4,5,7,10,3,2,1,?
		attValues1[0] = 5;
		attValues1[1] = 4;
		attValues1[2] = 4;
		attValues1[3] = 5;
		attValues1[4] = 7;
		attValues1[5] = 10;
		attValues1[6] = 3;
		attValues1[7] = 2;
		attValues1[8] = 1;

	//	8,10,10,8,7,10,9,7,1,?
		attValues2[0] = 8;
		attValues2[1] = 10;
		attValues2[2] = 10;
		attValues2[3] = 8;
		attValues2[4] = 7;
		attValues2[5] = 10;
		attValues2[6] = 9;
		attValues2[7] = 7;
		attValues2[8] = 1;

	//	10,5,5,3,6,7,7,10,1,?

		attValues3[0] = 10;
		attValues3[1] = 5;
		attValues3[2] = 5;
		attValues3[3] = 3;
		attValues3[4] = 6;
		attValues3[5] = 7;
		attValues3[6] = 7;
		attValues3[7] = 10;
		attValues3[8] = 1;

		//dataset.add(new Instance(1.0, attValues));
		Instance inst = new Instance(1.0, attValues1);
		Instance inst2 = new Instance(1.0, attValues2);
		Instance inst3 = new Instance(1.0, attValues3);
		dataset.add(inst);
		dataset.add(inst2);
		dataset.add(inst3);
		WekaWrapper ww = new WekaWrapper();
		dataset.setClassIndex(dataset.numAttributes() - 1);
		*/
/*double clsLabel = ww.classifyInstance(dataset.instance(0));
		System.out.println(dataset+
		"");*//*


		for (int i = 0; i < dataset.numInstances(); i++) {
			double clsLabel = ww.classifyInstance(dataset.instance(i));
			System.out.println(i + "----" + clsLabel + " -> " + dataset.classAttribute().value((int) clsLabel));
			Log.e(i + "----" + clsLabel + " -> " , dataset.classAttribute().value((int) clsLabel));
		}


		//System.out.println("----" + clsLabel + " -> " + dataset.classAttribute().value((int) clsLabel));
	}

	public  String test2(String[] str) throws Exception {
		Log.e("1111","");
		Attribute attr1 = new Attribute("clump_thickness");
		Attribute attr2 = new Attribute("uniformity_of_cell_size");
		Attribute attr3 = new Attribute("uniformity_of_cell_shape");
		Attribute attr4 = new Attribute("marginal_adhersion");
		Attribute attr5 = new Attribute("single_epithelial");
		Attribute attr6 = new Attribute("bare_nucleoli");
		Attribute attr7 = new Attribute("bland_chromatin");
		Attribute attr8 = new Attribute("normal_nucleoli");
		Attribute attr9 = new Attribute("irradiat");
		Log.e("1222","");
		FastVector labels = new FastVector();
		labels.addElement("2");
		labels.addElement("4");
		Attribute cls = new Attribute("class", labels);
		Log.e("1133331","");
		FastVector attributes = new FastVector();
		attributes.addElement(attr1);
		attributes.addElement(attr2);
		attributes.addElement(attr3);
		attributes.addElement(attr4);
		attributes.addElement(attr5);
		attributes.addElement(attr6);
		attributes.addElement(attr7);
		attributes.addElement(attr8);
		attributes.addElement(attr9);


		attributes.addElement(cls);


		Instances dataset = new Instances("Test-dataset", attributes, 0);

		double[] attValues1 = new double[dataset.numAttributes()];
		Log.e("4444","");
		//5,4,4,5,7,10,3,2,1,?
		attValues1[0] = Integer.parseInt(str[0]);
		attValues1[1] =  Integer.parseInt(str[1]);
		attValues1[2] =  Integer.parseInt(str[2]);
		attValues1[3] =  Integer.parseInt(str[3]);
		attValues1[4] =  Integer.parseInt(str[4]);
		attValues1[5] = Integer.parseInt(str[5]);
		attValues1[6] =  Integer.parseInt(str[6]);
		attValues1[7] =  Integer.parseInt(str[7]);
		attValues1[8] =  Integer.parseInt(str[8]);

		Log.e("555","");
		//dataset.add(new Instance(1.0, attValues));
		Instance inst = new Instance(1.0, attValues1);
		*/
/*Instance inst2 = new Instance(1.0, attValues2);
		Instance inst3 = new Instance(1.0, attValues3);*//*

		dataset.add(inst);
		*/
/*dataset.add(inst2);
		dataset.add(inst3);*//*

		WekaWrapper ww = new WekaWrapper();
		dataset.setClassIndex(dataset.numAttributes() - 1);
		*/
/*double clsLabel = ww.classifyInstance(dataset.instance(0));
		System.out.println(dataset+
		"");*//*

		Log.e("8888","");
		String s=null;
		for (int i = 0; i < dataset.numInstances(); i++) {
			Log.e("5454545","");

			double clsLabel=	 clsLabel = ww.classifyInstance(dataset.instance(i));
	 s=	dataset.classAttribute().value((int) clsLabel);
			System.out.println(i + "----" + clsLabel + " -> " + dataset.classAttribute().value((int) clsLabel));
			Log.e(i + "----" + clsLabel + " -> " , dataset.classAttribute().value((int) clsLabel));
		}
		Log.e("999","");
return s;
		//System.out.println("----" + clsLabel + " -> " + dataset.classAttribute().value((int) clsLabel));
	}



}*/
