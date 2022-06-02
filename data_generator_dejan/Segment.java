package generator;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Segment {
	
	public List<Sample> segments;
	
	public Segment (Sample start, Sample end, boolean isNoisy) {
		int steps = end.getTime() - start.getTime();
		int time;
		double value;
		Random rand = new Random();
		segments = new LinkedList<Sample>();
		for (int i = 0; i < steps; i++) {
			time = start.getTime() + i;
			value = (end.getValue() - start.getValue())/(end.getTime() - start.getTime())*(time - start.getTime()) + start.getValue();
			if (isNoisy) {
				value = value + (0.5 * rand.nextDouble()) - 0.25;
			}
			Sample sample = new Sample(time, value);
			segments.add(sample);
		}
	}
	
	public Segment (Sample start, Sample end, int samples) {
		int steps = (end.getTime() - start.getTime())*samples;
		int time;
		double value;
		Random rand = new Random();
		segments = new LinkedList<Sample>();
		for (int i = 0; i < steps; i++) {
			time = start.getTime() + (i/samples);
			value = (end.getValue() - start.getValue())/(end.getTime() - start.getTime())*(time - start.getTime()) + start.getValue();
			Sample sample = new Sample(time, value);
			segments.add(sample);
		}
	}
	
	public Segment (Sample start, Sample end) {
		segments = new LinkedList<Sample>();
		segments.add(start);
		segments.add(end);
	}
	
	public List<Sample> getSegment() {
		return segments;
	}

}
