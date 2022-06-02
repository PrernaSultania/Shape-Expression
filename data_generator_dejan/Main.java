package generator;

public class Main {

	public static void main(String[] args) {
		
//		String path = "experiments\\pulse_";

		String path = "/home/xin/Desktop/generator/experiments/pulse_";
		String ext = ".csv";
		for (int i=1; i<10000; i++) {
			for (int j=1; j<2; j++) {
				int input = (int) Math.pow(10, j);
				String id = "id_" + i;
				String nb = "nb_samples_" + input*100 +"_";
				String filename = path + nb + id+  ext;

//				System.out.println(filename);
				printPulses2 (filename, false, input);


			}
			
		}
		
		//printPulses ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\cav20-submission\\data\\experiments\\pulse2-3.csv", true);
		//printPulses ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\pulse-without-noise.csv", false);
		//printPulseInPulse ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\pulse-in-pulse.csv");
		//printPulseInnerNoise ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\pulse-inner-noise.csv");
		//printDDR2 ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\ddr2.csv", false);
		//printClock ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\clock10.csv", 10);
		//printClock ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\clock100.csv", 100);
		//printClock ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\clock1000.csv", 1000);
		//printClock ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\clock10000.csv", 10000);
		//printClock ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\clock100000.csv", 100000);
		//printClock ("C:\\Users\\NickovicD\\Documents\\work\\papers\\cpql\\data\\clock1000000.csv", 1000000);
		//printPulses2 ("C:\\Users\\NickovicD\\Documents\\work\\papers\\amt\\sttt19\\pulses0.csv", false, 0);
		//printPulses2 ("C:\\Users\\NickovicD\\Documents\\work\\papers\\amt\\sttt19\\pulses10.csv", false, 10);
		//printPulses2 ("C:\\Users\\NickovicD\\Documents\\work\\papers\\amt\\sttt19\\pulses100.csv", false, 100);
		//printPulses2 ("C:\\Users\\NickovicD\\Documents\\work\\papers\\amt\\sttt19\\pulses1000.csv", false, 1000);
		
	}
	
	private static void printDDR2(String filename, boolean flag) {
		R2SamplePrinter printer = new R2SamplePrinter(filename);
		
		
		R2Sample s1 = new R2Sample (0, 0, 0);
		R2Sample s2 = new R2Sample (100, 0, 0);
		R2Sample s3 = new R2Sample (150, 5.01, 0);
		R2Sample s4 = new R2Sample (5200, 5.01, 0);
		R2Sample s5 = new R2Sample (5203, 3.79, 0);
		R2Sample s6 = new R2Sample (5213, 3.79, 0);
		R2Sample s7 = new R2Sample (5216, 5.01, 0);
		R2Sample s8 = new R2Sample (5326, 5.01, 0);
		R2Sample s9 = new R2Sample (5329, 3.79, 0);
		R2Sample s10 = new R2Sample (5339, 3.79, 0);
		R2Sample s11 = new R2Sample (5342, 5.01, 0);
		R2Sample s12 = new R2Sample (5455, 5.01, 0);
		R2Sample s13 = new R2Sample (5458, 3.79, 0);
		R2Sample s14 = new R2Sample (5468, 3.79, 0);
		R2Sample s15 = new R2Sample (5471, 5.01, 0);
		R2Sample s16 = new R2Sample (5581, 5.01, 0);
		R2Sample s17 = new R2Sample (5584, 3.79, 0);
		R2Sample s18 = new R2Sample (5594, 3.79, 0);
		R2Sample s19 = new R2Sample (5597, 5.01, 0);
		R2Sample s20 = new R2Sample (5707, 5.01, 0);
		R2Sample s21 = new R2Sample (5710, 3.78, 0);
		R2Sample s22 = new R2Sample (5713, 3.79, 0);
		R2Sample s23 = new R2Sample (5716, 5.01, 0);
		R2Sample s24 = new R2Sample (10000, 5.01, 0);
		
		
		printer.addSegment(s1);
		printer.addSegment(s2);
		printer.addSegment(s3);
		printer.addSegment(s4);
		printer.addSegment(s5);
		printer.addSegment(s6);
		printer.addSegment(s7);
		printer.addSegment(s8);
		printer.addSegment(s9);
		printer.addSegment(s10);
		printer.addSegment(s11);
		printer.addSegment(s12);
		printer.addSegment(s13);
		printer.addSegment(s14);
		printer.addSegment(s15);
		printer.addSegment(s16);
		printer.addSegment(s17);
		printer.addSegment(s18);
		printer.addSegment(s19);
		printer.addSegment(s20);
		printer.addSegment(s21);
		printer.addSegment(s22);
		printer.addSegment(s23);
		printer.addSegment(s24);
		printer.print();
		
	}
	
	

	
	private static void printClock(String filename, int number) {
		SegmentPrinter printer = new SegmentPrinter(filename);
		
		for (int i=0; i<number; i++) {
			Sample s1 = new Sample(i*2,0);
			Sample s2 = new Sample(i*2 + 1,1);
			Segment seg = new Segment(s1, s2);
			printer.addSegment(seg);
		}
		printer.print();
	}
	
	
	private static void printPulses(String filename, boolean flag) {
		SegmentPrinter printer = new SegmentPrinter(filename);
		
		boolean isNoisy = true;
		
		Sample s1 = new Sample (0, 10);
		Sample s2 = new Sample (41, 10.1);
		Sample s3 = new Sample (60, 5.1);
		Sample s4 = new Sample (142, 4.9);
		Sample s5 = new Sample (179, 10.1);
		Sample s6 = new Sample (200, 9.9);
		
		Segment seg1 = new Segment(s1, s2, flag);
		Segment seg2 = new Segment(s2, s3, flag);
		Segment seg3 = new Segment(s3, s4, flag);
		Segment seg4 = new Segment(s4, s5, flag);
		Segment seg5 = new Segment(s5, s6, flag);
		
		
		printer.addSegment(seg1);
		printer.addSegment(seg2);
		printer.addSegment(seg3);
		printer.addSegment(seg4);
		printer.addSegment(seg5);
		
		
		printer.print();
		
	}
	
	private static void printPulses2(String filename, boolean flag, int number) {
		SegmentPrinter printer = new SegmentPrinter(filename);
		
		boolean isNoisy = true;
		
		for (int i=0; i<=number; i++) {
			Sample s1 = new Sample (0 + (i*100), 5);
			Sample s2 = new Sample (10+ (i*100), 5);
			Sample s3 = new Sample (11+ (i*100), 4);
			Sample s4 = new Sample (14+ (i*100), 4);
			Sample s5 = new Sample (15+ (i*100), 5);
			Sample s6 = new Sample (30+ (i*100), 5);
			Sample s7 = new Sample (31+ (i*100), 4);
			Sample s8 = new Sample (34+ (i*100), 4);
			Sample s9 = new Sample (35+ (i*100), 5);
			Sample s10 = new Sample (50+ (i*100), 5);
			Sample s11 = new Sample (52+ (i*100), 1);
			Sample s12 = new Sample (58+ (i*100), 1);
			Sample s13 = new Sample (60+ (i*100), 5);
			Sample s14 = new Sample (70+ (i*100), 5);
			Sample s15 = new Sample (71+ (i*100), 4);
			Sample s16 = new Sample (74+ (i*100), 4);
			Sample s17 = new Sample (75+ (i*100), 5);
			Sample s18 = new Sample (90+ (i*100), 5);
			Sample s19 = new Sample (92+ (i*100), 1);
			Sample s20 = new Sample (98+ (i*100), 1);
			Sample s21 = new Sample (99+ (i*100), 5);
			Sample s22 = new Sample (99+ (i*100), 5);
		
			Segment seg1 = new Segment(s1, s2, flag);
			Segment seg2 = new Segment(s2, s3, flag);
			Segment seg3 = new Segment(s3, s4, flag);
			Segment seg4 = new Segment(s4, s5, flag);
			Segment seg5 = new Segment(s5, s6, flag);
			Segment seg6 = new Segment(s6, s7, flag);
			Segment seg7 = new Segment(s7, s8, flag);
			Segment seg8 = new Segment(s8, s9, flag);
			Segment seg9 = new Segment(s9, s10, flag);
			Segment seg10 = new Segment(s10, s11, flag);
			Segment seg11 = new Segment(s11, s12, flag);
			Segment seg12 = new Segment(s12, s13, flag);
			Segment seg13 = new Segment(s13, s14, flag);
			Segment seg14 = new Segment(s14, s15, flag);
			Segment seg15 = new Segment(s15, s16, flag);
			Segment seg16 = new Segment(s16, s17, flag);
			Segment seg17 = new Segment(s17, s18, flag);
			Segment seg18 = new Segment(s18, s19, flag);
			Segment seg19 = new Segment(s19, s20, flag);
			Segment seg20 = new Segment(s20, s21, flag);
			Segment seg21 = new Segment(s21, s22, flag);
		
			printer.addSegment(seg1);
			printer.addSegment(seg2);
			printer.addSegment(seg3);
			printer.addSegment(seg4);
			printer.addSegment(seg5);
			printer.addSegment(seg6);
			printer.addSegment(seg7);
			printer.addSegment(seg8);
			printer.addSegment(seg9);
			printer.addSegment(seg10);
			printer.addSegment(seg11);
			printer.addSegment(seg12);
			printer.addSegment(seg13);
			printer.addSegment(seg14);
			printer.addSegment(seg15);
			printer.addSegment(seg16);
			printer.addSegment(seg17);
			printer.addSegment(seg18);
			printer.addSegment(seg19);
			printer.addSegment(seg20);
			printer.addSegment(seg21);
		}
		printer.print();
		
	}
	
	private static void printPulseInPulse(String filename) {
		SegmentPrinter printer = new SegmentPrinter(filename);
		
		boolean isNoisy = true;
		
		Sample s1 = new Sample (0, 5);
		Sample s2 = new Sample (100, 5);
		Sample s3 = new Sample (110, 4);
		Sample s4 = new Sample (140, 4);
		Sample s5 = new Sample (150, 3);
		Sample s6 = new Sample (300, 3);
		Sample s7 = new Sample (310, 4);
		Sample s8 = new Sample (340, 4);
		Sample s9 = new Sample (350, 5);
		Sample s10 = new Sample (500, 5);
		
		Segment seg1 = new Segment(s1, s2, false);
		Segment seg2 = new Segment(s2, s3, false);
		Segment seg3 = new Segment(s3, s4, false);
		Segment seg4 = new Segment(s4, s5, false);
		Segment seg5 = new Segment(s5, s6, false);
		Segment seg6 = new Segment(s6, s7, false);
		Segment seg7 = new Segment(s7, s8, false);
		Segment seg8 = new Segment(s8, s9, false);
		Segment seg9 = new Segment(s9, s10, false);
		
		printer.addSegment(seg1);
		printer.addSegment(seg2);
		printer.addSegment(seg3);
		printer.addSegment(seg4);
		printer.addSegment(seg5);
		printer.addSegment(seg6);
		printer.addSegment(seg7);
		printer.addSegment(seg8);
		printer.addSegment(seg9);
		
		printer.print();
		
	}
	
	private static void printPulseInnerNoise(String filename) {
		SegmentPrinter printer = new SegmentPrinter(filename);
		
		boolean isNoisy = true;
		
		Sample s1 = new Sample (0, 5);
		Sample s2 = new Sample (100, 5);
		Sample s3 = new Sample (110, 4);
		Sample s4 = new Sample (140, 4);
		Sample s5 = new Sample (150, 5);
		Sample s6 = new Sample (300, 5);
		Sample s7 = new Sample (310, 4);
		Sample s7a = new Sample (320, 4);
		Sample s7b = new Sample (330, 4);
		Sample s8 = new Sample (340, 4);
		Sample s9 = new Sample (350, 5);
		Sample s10 = new Sample (500, 5);
		
		Segment seg1 = new Segment(s1, s2, false);
		Segment seg2 = new Segment(s2, s3, false);
		Segment seg3 = new Segment(s3, s4, false);
		Segment seg4 = new Segment(s4, s5, false);
		Segment seg5 = new Segment(s5, s6, false);
		Segment seg6 = new Segment(s6, s7, false);
		Segment seg7a = new Segment(s7, s7a, false);
		Segment seg7b = new Segment(s7a, s7b, true);
		Segment seg7c = new Segment(s7b, s8, false);
		Segment seg8 = new Segment(s8, s9, false);
		Segment seg9 = new Segment(s9, s10, false);
		
		printer.addSegment(seg1);
		printer.addSegment(seg2);
		printer.addSegment(seg3);
		printer.addSegment(seg4);
		printer.addSegment(seg5);
		printer.addSegment(seg6);
		printer.addSegment(seg7a);
		printer.addSegment(seg7b);
		printer.addSegment(seg7c);
		printer.addSegment(seg8);
		printer.addSegment(seg9);
		
		printer.print();
		
	}

}
