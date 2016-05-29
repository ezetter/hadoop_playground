package com.zetterbaum.hadoop_test;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.util.SortedMap;
import java.util.TreeMap;


public class TopNMapper extends Mapper<Text, IntWritable, NullWritable, Text>{
    private SortedMap<Double, Text> top10 = new TreeMap<Double, Text>();
    private int N = 10;

    public void map(Text key, Text value, Context context) {
        String[] tokens = value.toString().split(",");
    }

    protected void setup(Context context) {

    }

}
