package jp.co.yahoo.ad_api_sample.reportDownloadSample;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Sample TestCase for ReportDownloadSampleTest.<br>
 * Copyright (C) 2016 Yahoo Japan Corporation. All Rights Reserved.
 */
public class ReportDownloadSampleTest {

  /**
   * Sample TestCase of main method for ReportDownloadSampleTest.
   */
   @Test
   public void testMain() throws Exception {
     try{
        ReportDownloadSample.main(null);
     }catch(Exception e){
        fail();
     }
   }
}
