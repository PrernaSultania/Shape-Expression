package generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SegmentPrinter {
	String filename;
	List<Segment> segments;
	
	public SegmentPrinter(String filename) {
		this.filename = filename;
		segments = new LinkedList<Segment>();
	}
	
	public void addSegment(Segment segment) {
		segments.add(segment);
	}
	
	public void print() {
		BufferedWriter writer = null;
        try {
            File file = new File(filename);
            writer = new BufferedWriter(new FileWriter(file));
            Iterator<Segment> segmentIter = segments.iterator();
            writer.write("Time, Value");
            writer.newLine();
            while (segmentIter.hasNext()) {
            	Segment segment = segmentIter.next();
            	Iterator<Sample> sampleIter = segment.getSegment().iterator();
            	while (sampleIter.hasNext()) {
            		Sample sample = sampleIter.next();
            		writer.write(sample.getTime() + " , " + sample.getValue());
            		writer.newLine();
            	}

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
	}

}
