package generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class R2SamplePrinter {
	String filename;
	List<R2Sample> segments;
	
	public R2SamplePrinter(String filename) {
		this.filename = filename;
		segments = new LinkedList<R2Sample>();
	}
	
	public void addSegment(R2Sample sample) {
		segments.add(sample);
	}
	
	public void print() {
		BufferedWriter writer = null;
        try {
            File file = new File(filename);
            writer = new BufferedWriter(new FileWriter(file));
            Iterator<R2Sample> segmentIter = segments.iterator();
            writer.write("Time, Value1, Value2");
            writer.newLine();
            while (segmentIter.hasNext()) {
            	R2Sample segment = segmentIter.next();
            	writer.write(segment.getTime() + " , " + segment.getValue1() + " , " + segment.getValue2());
            	writer.newLine();
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
