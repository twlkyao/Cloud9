package edu.umd.cloud9.data;

import org.apache.hadoop.mapred.FileInputFormat;

public abstract class IndexableFileInputFormat<K, V extends Indexable> extends
		FileInputFormat<K, V> {

}