import java.util.List;

import javax.xml.ws.Holder;

import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTracker;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerCategory;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerOperation;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerPage;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerReturnValue;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerSelector;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerService;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerServiceInterface;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerStatus;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerType;
import jp.yahooapis.im.V5.ConversionTrackerService.ConversionTrackerValues;
import jp.yahooapis.im.V5.ConversionTrackerService.Operator;
import jp.yahooapis.im.V5.ConversionTrackerService.Paging;
import util.SoapUtils;
import error.impl.ConversionTrackerServiceErrorEntityFactory;


/**
 * Sample Program for ConversionTrackerService. Copyright (C) 2014 Yahoo Japan Corporation. All
 * Rights Reserved.
 */
public class ConversionTrackerSample {

  /**
   * main method for ConversionTracker
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    try {
      long accountId = SoapUtils.getAccountId();
      long conversionTrackerId = 0;

      // =================================================================
      // ConversionTrackerService
      // =================================================================
      ConversionTrackerServiceInterface conversionTrackerService =
          SoapUtils.createServiceInterface(ConversionTrackerServiceInterface.class,
              ConversionTrackerService.class);

      // -----------------------------------------------
      // ConversionTrackerService::mutate(ADD)
      // -----------------------------------------------
      ConversionTracker addConversionTracker = new ConversionTracker();
      addConversionTracker.setAccountId(accountId);
      addConversionTracker.setConversionTrackerName("SampleConversionTracker_CreateOn_"
          + SoapUtils.getCurrentTimestamp());
      addConversionTracker.setStatus(ConversionTrackerStatus.ENABLED);
      addConversionTracker.setCategory(ConversionTrackerCategory.PURCHASE);
      addConversionTracker.setConversionTrackerType(ConversionTrackerType.WEB_CONVERSION);

      ConversionTrackerOperation addConversionTrackerOperation = new ConversionTrackerOperation();
      addConversionTrackerOperation.setAccountId(accountId);
      addConversionTrackerOperation.setOperator(Operator.ADD);
      addConversionTrackerOperation.getOperand().add(addConversionTracker);

      // call API
      System.out.println("############################################");
      System.out.println("ConversionTrackerService::mutate(ADD)");
      System.out.println("############################################");
      Holder<ConversionTrackerReturnValue> addConversionTrackerReturnValueHolder =
          new Holder<ConversionTrackerReturnValue>();
      Holder<List<jp.yahooapis.im.V5.ConversionTrackerService.Error>> addConversionTrackerErrorHolder =
          new Holder<List<jp.yahooapis.im.V5.ConversionTrackerService.Error>>();
      conversionTrackerService.mutate(addConversionTrackerOperation,
          addConversionTrackerReturnValueHolder, addConversionTrackerErrorHolder);

      // if error
      if (addConversionTrackerErrorHolder.value != null
          && addConversionTrackerErrorHolder.value.size() > 0) {
        SoapUtils.displayErrors(new ConversionTrackerServiceErrorEntityFactory(
            addConversionTrackerErrorHolder.value), true);
      }

      // response
      if (addConversionTrackerReturnValueHolder.value != null) {
        for (ConversionTrackerValues values : addConversionTrackerReturnValueHolder.value
            .getValues()) {
          if (values.isOperationSucceeded()) {
            // display response
            displayConversionTracker(values.getConversionTracker());
            conversionTrackerId = values.getConversionTracker().getConversionTrackerId();
          } else {
            // if error
            SoapUtils.displayErrors(
                new ConversionTrackerServiceErrorEntityFactory(values.getError()), true);
          }
        }
      }

      // -----------------------------------------------
      // ConversionTrackerService::get
      // -----------------------------------------------
      ConversionTrackerSelector conversionTrackerSelector = new ConversionTrackerSelector();
      conversionTrackerSelector.setAccountId(accountId);
      conversionTrackerSelector.getConversionTrackerIds().add(conversionTrackerId);
      Paging paging = new Paging();
      paging.setStartIndex(1);
      paging.setNumberResults(20);
      conversionTrackerSelector.setPaging(paging);

      // call API
      System.out.println("############################################");
      System.out.println("ConversionTrackerService::get");
      System.out.println("############################################");
      Holder<ConversionTrackerPage> getConversionTrackerPageHolder =
          new Holder<ConversionTrackerPage>();
      Holder<List<jp.yahooapis.im.V5.ConversionTrackerService.Error>> getConversionTrackerErrorHolder =
          new Holder<List<jp.yahooapis.im.V5.ConversionTrackerService.Error>>();
      conversionTrackerService.get(conversionTrackerSelector, getConversionTrackerPageHolder,
          getConversionTrackerErrorHolder);

      // if error
      if (getConversionTrackerErrorHolder.value != null
          && getConversionTrackerErrorHolder.value.size() > 0) {
        SoapUtils.displayErrors(new ConversionTrackerServiceErrorEntityFactory(
            getConversionTrackerErrorHolder.value), true);
      }

      // response
      if (getConversionTrackerErrorHolder.value != null) {
        for (ConversionTrackerValues values : getConversionTrackerPageHolder.value.getValues()) {
          if (values.isOperationSucceeded()) {
            displayConversionTracker(values.getConversionTracker());
          } else {
            SoapUtils.displayErrors(
                new ConversionTrackerServiceErrorEntityFactory(values.getError()), true);
          }
        }
      }


      // -----------------------------------------------
      // ConversionTrackerService::mutate(SET)
      // -----------------------------------------------
      ConversionTracker setConversionTracker = new ConversionTracker();
      setConversionTracker.setAccountId(accountId);
      setConversionTracker.setConversionTrackerId(conversionTrackerId);
      setConversionTracker.setConversionTrackerName("SampleConversionTracker_UpdateOn_"
          + SoapUtils.getCurrentTimestamp());
      setConversionTracker.setStatus(ConversionTrackerStatus.DISABLED);
      setConversionTracker.setCategory(ConversionTrackerCategory.PAGE_VIEW);
      setConversionTracker.setUserRevenueValue((long) 300);
      setConversionTracker.setConversionTrackerType(ConversionTrackerType.WEB_CONVERSION);

      ConversionTrackerOperation setConversionTrackerOperation = new ConversionTrackerOperation();
      setConversionTrackerOperation.setAccountId(accountId);
      setConversionTrackerOperation.setOperator(Operator.SET);
      setConversionTrackerOperation.getOperand().add(setConversionTracker);
      // call API
      System.out.println("############################################");
      System.out.println("ConversionTrackerService::mutate(SET)");
      System.out.println("############################################");
      Holder<ConversionTrackerReturnValue> setConversionTrackerReturnValueHolder =
          new Holder<ConversionTrackerReturnValue>();
      Holder<List<jp.yahooapis.im.V5.ConversionTrackerService.Error>> setConversionTrackerErrorHolder =
          new Holder<List<jp.yahooapis.im.V5.ConversionTrackerService.Error>>();
      conversionTrackerService.mutate(setConversionTrackerOperation,
          setConversionTrackerReturnValueHolder, setConversionTrackerErrorHolder);

      // if error
      if (setConversionTrackerErrorHolder.value != null
          && setConversionTrackerErrorHolder.value.size() > 0) {
        SoapUtils.displayErrors(new ConversionTrackerServiceErrorEntityFactory(
            setConversionTrackerErrorHolder.value), true);
      }

      // response
      if (setConversionTrackerReturnValueHolder.value != null) {
        for (ConversionTrackerValues values : setConversionTrackerReturnValueHolder.value
            .getValues()) {
          if (values.isOperationSucceeded()) {
            displayConversionTracker(values.getConversionTracker());
          } else {
            SoapUtils.displayErrors(
                new ConversionTrackerServiceErrorEntityFactory(values.getError()), true);
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * display ConversionTracker entity to stdout.
   * 
   * @param conversionTracker ConversionTracker entity for display.
   */
  private static void displayConversionTracker(ConversionTracker conversionTracker) {
    System.out.println("accountId = " + conversionTracker.getAccountId());
    System.out.println("conversionTrackerId = " + conversionTracker.getConversionTrackerId());
    System.out.println("conversionTrackerName = " + conversionTracker.getConversionTrackerName());
    System.out.println("status = " + conversionTracker.getStatus());
    System.out.println("isUnknownDomain = " + conversionTracker.getCategory());
    System.out.println("numConversionEvents = " + conversionTracker.getNumConversionEvents());
    System.out.println("conversionValue = " + conversionTracker.getConversionValue());
    System.out.println("mostRecentConversionDate = "
        + conversionTracker.getMostRecentConversionDate());
    System.out.println("userRevenueValue = " + conversionTracker.getUserRevenueValue());
    System.out.println("conversionTrackerType = " + conversionTracker.getConversionTrackerType());
    System.out.println("---------");
  }
}