package com.socialmaster.spout.random;

import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

/**
 * Created by liuxiaojun on 2017/2/20.
 */
public class UpperBolt  extends BaseBasicBolt {
    public void execute(Tuple tuple, BasicOutputCollector collector) {
        String src_word = tuple.getString(0);
        String upper_word = src_word.toUpperCase();
        collector.emit(new Values(upper_word));
    }

    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("upper_word"));
    }
}
