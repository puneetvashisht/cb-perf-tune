package org.sample;

import org.openjdk.jmh.annotations.Benchmark;

public class PerformanceBenchmark {
    public Boolean isPrime1(Integer testNumber) {
		for (Integer i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}

    // improved version...
    public boolean isPrime2(int testNumber) {
		for (int i = 2; i < Math.sqrt(testNumber); i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}

    @Benchmark
    public void testVersion1(){
//        for(int i=0;i<50000;i++){
//            isPrime1(i);
//        }
    	main.Main vMain = new main.Main();
    	try {
			vMain.version1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @Benchmark
    public void testVersion2(){
    	main.Main vMain = new main.Main();
    	try {
			vMain.version2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
