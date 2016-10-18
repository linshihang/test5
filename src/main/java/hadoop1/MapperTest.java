package hadoop1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;

import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by ASUS on 2016/8/15.
 */
public class MapperTest extends Mapper<LongWritable,Text,Text,IntWritable> {
    public void mapper() {
        Text t = new Text();
        
    }
}
