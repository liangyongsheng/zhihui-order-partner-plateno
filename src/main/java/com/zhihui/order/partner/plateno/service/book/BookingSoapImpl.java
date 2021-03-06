
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.zhihui.order.partner.plateno.service.book;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2016-02-16T14:55:54.280+08:00
 * Generated source version: 2.7.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "Booking",
                      portName = "BookingSoap12",
                      targetNamespace = "http://www.7daysinn.cn/booking",
                      wsdlLocation = "http://121.33.201.180:6005/Booking.asmx?wsdl",
                      endpointInterface = "com.zhihui.order.partner.plateno.service.book.BookingSoap")
                      
public class BookingSoapImpl implements BookingSoap {

    private static final Logger LOG = Logger.getLogger(BookingSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#postBookInfoWithPackage(java.lang.String  sAuth ,)com.zhihui.order.partner.plateno.service.book.CRequestBookingInfo  bookingRequest ,)com.zhihui.order.partner.plateno.service.book.ArrayOfDConfigPackage  arrPackage ,)java.math.BigDecimal  roomPrice ,)java.lang.Integer  postBookInfoWithPackageResult ,)com.zhihui.order.partner.plateno.service.book.ArrayOfDResponseBookingResult  bookResponse )*
     */
    public void postBookInfoWithPackage(java.lang.String sAuth,com.zhihui.order.partner.plateno.service.book.CRequestBookingInfo bookingRequest,com.zhihui.order.partner.plateno.service.book.ArrayOfDConfigPackage arrPackage,java.math.BigDecimal roomPrice,javax.xml.ws.Holder<java.lang.Integer> postBookInfoWithPackageResult,javax.xml.ws.Holder<ArrayOfDResponseBookingResult> bookResponse) { 
        LOG.info("Executing operation postBookInfoWithPackage");
        System.out.println(sAuth);
        System.out.println(bookingRequest);
        System.out.println(arrPackage);
        System.out.println(roomPrice);
        try {
            int postBookInfoWithPackageResultValue = -136123057;
            postBookInfoWithPackageResult.value = postBookInfoWithPackageResultValue;
            com.zhihui.order.partner.plateno.service.book.ArrayOfDResponseBookingResult bookResponseValue = new com.zhihui.order.partner.plateno.service.book.ArrayOfDResponseBookingResult();
            java.util.List<com.zhihui.order.partner.plateno.service.book.DResponseBookingResult> bookResponseValueDResponseBookingResult = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.DResponseBookingResult>();
            com.zhihui.order.partner.plateno.service.book.DResponseBookingResult bookResponseValueDResponseBookingResultVal1 = new com.zhihui.order.partner.plateno.service.book.DResponseBookingResult();
            bookResponseValueDResponseBookingResultVal1.setOrderNO("OrderNO1223419572");
            bookResponseValueDResponseBookingResultVal1.setMessage("Message-381557509");
            bookResponseValueDResponseBookingResult.add(bookResponseValueDResponseBookingResultVal1);
            bookResponseValue.getDResponseBookingResult().addAll(bookResponseValueDResponseBookingResult);
            bookResponse.value = bookResponseValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#isBookingAssure(java.lang.String  sAuth ,)java.lang.String  sCity ,)int  nHotelId ,)javax.xml.datatype.XMLGregorianCalendar  dtBegin ,)javax.xml.datatype.XMLGregorianCalendar  dtEnd ,)java.lang.String  sRoomType ,)int  nRoomNum ,)java.lang.Integer  isBookingAssureResult ,)java.lang.String  sMsg )*
     */
    public void isBookingAssure(java.lang.String sAuth,java.lang.String sCity,int nHotelId,javax.xml.datatype.XMLGregorianCalendar dtBegin,javax.xml.datatype.XMLGregorianCalendar dtEnd,java.lang.String sRoomType,int nRoomNum,javax.xml.ws.Holder<java.lang.Integer> isBookingAssureResult,javax.xml.ws.Holder<java.lang.String> sMsg) { 
        LOG.info("Executing operation isBookingAssure");
        System.out.println(sAuth);
        System.out.println(sCity);
        System.out.println(nHotelId);
        System.out.println(dtBegin);
        System.out.println(dtEnd);
        System.out.println(sRoomType);
        System.out.println(nRoomNum);
        try {
            int isBookingAssureResultValue = -192447806;
            isBookingAssureResult.value = isBookingAssureResultValue;
            java.lang.String sMsgValue = "sMsgValue-255875748";
            sMsg.value = sMsgValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#addMarketOrder(java.lang.String  authentication ,)com.zhihui.order.partner.plateno.service.book.RequestBookingInfo  bookRequest ,)java.lang.Integer  addMarketOrderResult ,)com.zhihui.order.partner.plateno.service.book.ArrayOfResponseBookingInfo  bookResponse )*
     */
    public void addMarketOrder(java.lang.String authentication,com.zhihui.order.partner.plateno.service.book.RequestBookingInfo bookRequest,javax.xml.ws.Holder<java.lang.Integer> addMarketOrderResult,javax.xml.ws.Holder<ArrayOfResponseBookingInfo> bookResponse) { 
        LOG.info("Executing operation addMarketOrder");
        System.out.println(authentication);
        System.out.println(bookRequest);
        try {
            int addMarketOrderResultValue = -19984092;
            addMarketOrderResult.value = addMarketOrderResultValue;
            com.zhihui.order.partner.plateno.service.book.ArrayOfResponseBookingInfo bookResponseValue = new com.zhihui.order.partner.plateno.service.book.ArrayOfResponseBookingInfo();
            java.util.List<com.zhihui.order.partner.plateno.service.book.ResponseBookingInfo> bookResponseValueResponseBookingInfo = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.ResponseBookingInfo>();
            com.zhihui.order.partner.plateno.service.book.ResponseBookingInfo bookResponseValueResponseBookingInfoVal1 = new com.zhihui.order.partner.plateno.service.book.ResponseBookingInfo();
            bookResponseValueResponseBookingInfoVal1.setOrderNO("OrderNO-814758896");
            bookResponseValueResponseBookingInfoVal1.setMessage("Message-161894811");
            bookResponseValueResponseBookingInfo.add(bookResponseValueResponseBookingInfoVal1);
            bookResponseValue.getResponseBookingInfo().addAll(bookResponseValueResponseBookingInfo);
            bookResponse.value = bookResponseValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#getForecastRoomStatusFromCache(java.lang.String  authentication ,)int  nHotelId ,)javax.xml.datatype.XMLGregorianCalendar  dtStartTime ,)javax.xml.datatype.XMLGregorianCalendar  dtEndTime ,)java.lang.String  sRoomType ,)java.lang.Integer  getForecastRoomStatusFromCacheResult ,)com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatus  lstForecastRoomStatus )*
     */
    public void getForecastRoomStatusFromCache(java.lang.String authentication,int nHotelId,javax.xml.datatype.XMLGregorianCalendar dtStartTime,javax.xml.datatype.XMLGregorianCalendar dtEndTime,java.lang.String sRoomType,javax.xml.ws.Holder<java.lang.Integer> getForecastRoomStatusFromCacheResult,javax.xml.ws.Holder<ArrayOfDForecastRoomStatus> lstForecastRoomStatus) { 
        LOG.info("Executing operation getForecastRoomStatusFromCache");
        System.out.println(authentication);
        System.out.println(nHotelId);
        System.out.println(dtStartTime);
        System.out.println(dtEndTime);
        System.out.println(sRoomType);
        try {
            int getForecastRoomStatusFromCacheResultValue = -742211614;
            getForecastRoomStatusFromCacheResult.value = getForecastRoomStatusFromCacheResultValue;
            com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatus lstForecastRoomStatusValue = new com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatus();
            java.util.List<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus> lstForecastRoomStatusValueDForecastRoomStatus = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus>();
            com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus lstForecastRoomStatusValueDForecastRoomStatusVal1 = new com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus();
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setHotelName("HotelName-248595877");
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setHotelId(-365304372);
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setRoomType("RoomType686480937");
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setRoomTypeName("RoomTypeName-1115779746");
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setIsCanBooking(false);
            com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatusItem lstForecastRoomStatusValueDForecastRoomStatusVal1RateItems = new com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatusItem();
            java.util.List<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatusItem> lstForecastRoomStatusValueDForecastRoomStatusVal1RateItemsDForecastRoomStatusItem = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatusItem>();
            lstForecastRoomStatusValueDForecastRoomStatusVal1RateItems.getDForecastRoomStatusItem().addAll(lstForecastRoomStatusValueDForecastRoomStatusVal1RateItemsDForecastRoomStatusItem);
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setRateItems(lstForecastRoomStatusValueDForecastRoomStatusVal1RateItems);
            lstForecastRoomStatusValueDForecastRoomStatus.add(lstForecastRoomStatusValueDForecastRoomStatusVal1);
            lstForecastRoomStatusValue.getDForecastRoomStatus().addAll(lstForecastRoomStatusValueDForecastRoomStatus);
            lstForecastRoomStatus.value = lstForecastRoomStatusValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#getOrderNoBookingInfo(java.lang.String  authentication ,)java.lang.String  sOrderNo ,)com.zhihui.order.partner.plateno.service.book.CTBookingInfo  theBookingInfo ,)java.lang.Integer  getOrderNoBookingInfoResult )*
     */
    public void getOrderNoBookingInfo(java.lang.String authentication,java.lang.String sOrderNo,javax.xml.ws.Holder<CTBookingInfo> theBookingInfo,javax.xml.ws.Holder<java.lang.Integer> getOrderNoBookingInfoResult) { 
        LOG.info("Executing operation getOrderNoBookingInfo");
        System.out.println(authentication);
        System.out.println(sOrderNo);
        System.out.println(theBookingInfo.value);
        try {
            int getOrderNoBookingInfoResultValue = 1560388251;
            getOrderNoBookingInfoResult.value = getOrderNoBookingInfoResultValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#getMarket(java.lang.String  authentication )*
     */
    public com.zhihui.order.partner.plateno.service.book.ArrayOfMarketActInfo getMarket(java.lang.String authentication) { 
        LOG.info("Executing operation getMarket");
        System.out.println(authentication);
        try {
            com.zhihui.order.partner.plateno.service.book.ArrayOfMarketActInfo _return = new com.zhihui.order.partner.plateno.service.book.ArrayOfMarketActInfo();
            java.util.List<com.zhihui.order.partner.plateno.service.book.MarketActInfo> _returnMarketActInfo = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.MarketActInfo>();
            com.zhihui.order.partner.plateno.service.book.MarketActInfo _returnMarketActInfoVal1 = new com.zhihui.order.partner.plateno.service.book.MarketActInfo();
            _returnMarketActInfoVal1.setMarketActID(-1445569633);
            _returnMarketActInfoVal1.setMarketActName("MarketActName686425029");
            _returnMarketActInfoVal1.setBeginDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-02-16T14:55:54.298+08:00"));
            _returnMarketActInfoVal1.setEndDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-02-16T14:55:54.299+08:00"));
            _returnMarketActInfoVal1.setMustPayFlag(false);
            _returnMarketActInfoVal1.setCanCancelFlag(true);
            _returnMarketActInfoVal1.setAheadBookDay(-1602025634);
            _returnMarketActInfoVal1.setAheadCancelDay(1165866437);
            _returnMarketActInfo.add(_returnMarketActInfoVal1);
            _return.getMarketActInfo().addAll(_returnMarketActInfo);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#queryMarketQuota(java.lang.String  authentication ,)int  hotelID ,)int  marketActID ,)javax.xml.datatype.XMLGregorianCalendar  beginDate ,)javax.xml.datatype.XMLGregorianCalendar  endDate ,)com.zhihui.order.partner.plateno.service.book.ArrayOfQuota  quotas ,)java.lang.Integer  queryMarketQuotaResult )*
     */
    public void queryMarketQuota(java.lang.String authentication,int hotelID,int marketActID,javax.xml.datatype.XMLGregorianCalendar beginDate,javax.xml.datatype.XMLGregorianCalendar endDate,javax.xml.ws.Holder<ArrayOfQuota> quotas,javax.xml.ws.Holder<java.lang.Integer> queryMarketQuotaResult) { 
        LOG.info("Executing operation queryMarketQuota");
        System.out.println(authentication);
        System.out.println(hotelID);
        System.out.println(marketActID);
        System.out.println(beginDate);
        System.out.println(endDate);
        System.out.println(quotas.value);
        try {
            int queryMarketQuotaResultValue = -193198330;
            queryMarketQuotaResult.value = queryMarketQuotaResultValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#getBookingInfoByCompose(java.lang.String  authentication ,)com.zhihui.order.partner.plateno.service.book.ComposeSearchInfo  objCompose ,)com.zhihui.order.partner.plateno.service.book.ArrayOfCTBookingInfo  arrBookingInfo ,)java.lang.Integer  getBookingInfoByComposeResult )*
     */
    public void getBookingInfoByCompose(java.lang.String authentication,com.zhihui.order.partner.plateno.service.book.ComposeSearchInfo objCompose,javax.xml.ws.Holder<ArrayOfCTBookingInfo> arrBookingInfo,javax.xml.ws.Holder<java.lang.Integer> getBookingInfoByComposeResult) { 
        LOG.info("Executing operation getBookingInfoByCompose");
        System.out.println(authentication);
        System.out.println(objCompose);
        System.out.println(arrBookingInfo.value);
        try {
            int getBookingInfoByComposeResultValue = 340407835;
            getBookingInfoByComposeResult.value = getBookingInfoByComposeResultValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#getAccTranInfo(java.lang.String  sOrderNO ,)java.lang.String  authentication ,)java.lang.Integer  getAccTranInfoResult ,)com.zhihui.order.partner.plateno.service.book.ArrayOfAccTrans  lst )*
     */
    public void getAccTranInfo(java.lang.String sOrderNO,java.lang.String authentication,javax.xml.ws.Holder<java.lang.Integer> getAccTranInfoResult,javax.xml.ws.Holder<ArrayOfAccTrans> lst) { 
        LOG.info("Executing operation getAccTranInfo");
        System.out.println(sOrderNO);
        System.out.println(authentication);
        try {
            int getAccTranInfoResultValue = 714486806;
            getAccTranInfoResult.value = getAccTranInfoResultValue;
            com.zhihui.order.partner.plateno.service.book.ArrayOfAccTrans lstValue = new com.zhihui.order.partner.plateno.service.book.ArrayOfAccTrans();
            java.util.List<com.zhihui.order.partner.plateno.service.book.sub.AccTrans> lstValueAccTrans = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.sub.AccTrans>();
            com.zhihui.order.partner.plateno.service.book.sub.AccTrans lstValueAccTransVal1 = new com.zhihui.order.partner.plateno.service.book.sub.AccTrans();
            lstValueAccTransVal1.setNChainID(-1970111919);
            lstValueAccTransVal1.setNFolioID(-1972272315);
            lstValueAccTransVal1.setSRoomNo("SRoomNo-1682266225");
            lstValueAccTransVal1.setNTransID(88680164);
            lstValueAccTransVal1.setNItemID(-947615652);
            lstValueAccTransVal1.setSItemName("SItemName-1022094072");
            lstValueAccTransVal1.setDtTransdate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-02-16T14:55:54.303+08:00"));
            lstValueAccTransVal1.setSRemark("SRemark-35532255");
            lstValueAccTransVal1.setMAmount(new java.math.BigDecimal("-6834835964481369373.7667647054705673791"));
            lstValueAccTransVal1.setNCashier(-924557806);
            lstValueAccTransVal1.setDtAccDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-02-16T14:55:54.303+08:00"));
            lstValueAccTransVal1.setSRefNo("SRefNo-1455918799");
            lstValueAccTransVal1.setBDebOrCre(true);
            lstValueAccTransVal1.setVoidFlag(1762025506);
            lstValueAccTrans.add(lstValueAccTransVal1);
            lstValue.getAccTrans().addAll(lstValueAccTrans);
            lst.value = lstValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#cancelBooking(java.lang.String  sOrderNo ,)java.lang.String  authentication )*
     */
    public int cancelBooking(java.lang.String sOrderNo,java.lang.String authentication) { 
        LOG.info("Executing operation cancelBooking");
        System.out.println(sOrderNo);
        System.out.println(authentication);
        try {
            int _return = -177384125;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#getHotelConstraint(java.lang.String  authentication ,)int  nHotelId ,)com.zhihui.order.partner.plateno.service.book.ArrayOfDateTime  lstEndOfDay ,)java.lang.Integer  getHotelConstraintResult )*
     */
    public void getHotelConstraint(java.lang.String authentication,int nHotelId,javax.xml.ws.Holder<ArrayOfDateTime> lstEndOfDay,javax.xml.ws.Holder<java.lang.Integer> getHotelConstraintResult) { 
        LOG.info("Executing operation getHotelConstraint");
        System.out.println(authentication);
        System.out.println(nHotelId);
        System.out.println(lstEndOfDay.value);
        try {
            int getHotelConstraintResultValue = 64225118;
            getHotelConstraintResult.value = getHotelConstraintResultValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#addAccTran(java.lang.String  sOrderNo ,)java.math.BigDecimal  dAmount ,)java.lang.String  authentication )*
     */
    public int addAccTran(java.lang.String sOrderNo,java.math.BigDecimal dAmount,java.lang.String authentication) { 
        LOG.info("Executing operation addAccTran");
        System.out.println(sOrderNo);
        System.out.println(dAmount);
        System.out.println(authentication);
        try {
            int _return = -2028965206;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#checkMarketOrderCondition(java.lang.String  authentication ,)com.zhihui.order.partner.plateno.service.book.EValidationType  type ,)java.lang.String  mebCardNo ,)int  marketActID ,)int  hotelID ,)java.lang.String  roomType ,)javax.xml.datatype.XMLGregorianCalendar  beginDate ,)javax.xml.datatype.XMLGregorianCalendar  endDate ,)java.lang.String  errorMessage ,)java.lang.Boolean  checkMarketOrderConditionResult )*
     */
    public void checkMarketOrderCondition(java.lang.String authentication,com.zhihui.order.partner.plateno.service.book.EValidationType type,java.lang.String mebCardNo,int marketActID,int hotelID,java.lang.String roomType,javax.xml.datatype.XMLGregorianCalendar beginDate,javax.xml.datatype.XMLGregorianCalendar endDate,javax.xml.ws.Holder<java.lang.String> errorMessage,javax.xml.ws.Holder<java.lang.Boolean> checkMarketOrderConditionResult) { 
        LOG.info("Executing operation checkMarketOrderCondition");
        System.out.println(authentication);
        System.out.println(type);
        System.out.println(mebCardNo);
        System.out.println(marketActID);
        System.out.println(hotelID);
        System.out.println(roomType);
        System.out.println(beginDate);
        System.out.println(endDate);
        System.out.println(errorMessage.value);
        try {
            boolean checkMarketOrderConditionResultValue = false;
            checkMarketOrderConditionResult.value = checkMarketOrderConditionResultValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#postReservationInfoWithPackage(java.lang.String  sAuth ,)com.zhihui.order.partner.plateno.service.book.RequestReservationInfo  bookingRequest ,)com.zhihui.order.partner.plateno.service.book.ArrayOfDConfigPackage  arrPackage ,)java.math.BigDecimal  roomPrice ,)java.lang.Integer  postReservationInfoWithPackageResult ,)com.zhihui.order.partner.plateno.service.book.ArrayOfDResponseBookingResult  bookResponse )*
     */
    public void postReservationInfoWithPackage(java.lang.String sAuth,com.zhihui.order.partner.plateno.service.book.RequestReservationInfo bookingRequest,com.zhihui.order.partner.plateno.service.book.ArrayOfDConfigPackage arrPackage,java.math.BigDecimal roomPrice,javax.xml.ws.Holder<java.lang.Integer> postReservationInfoWithPackageResult,javax.xml.ws.Holder<ArrayOfDResponseBookingResult> bookResponse) { 
        LOG.info("Executing operation postReservationInfoWithPackage");
        System.out.println(sAuth);
        System.out.println(bookingRequest);
        System.out.println(arrPackage);
        System.out.println(roomPrice);
        try {
            int postReservationInfoWithPackageResultValue = -1650489964;
            postReservationInfoWithPackageResult.value = postReservationInfoWithPackageResultValue;
            com.zhihui.order.partner.plateno.service.book.ArrayOfDResponseBookingResult bookResponseValue = new com.zhihui.order.partner.plateno.service.book.ArrayOfDResponseBookingResult();
            java.util.List<com.zhihui.order.partner.plateno.service.book.DResponseBookingResult> bookResponseValueDResponseBookingResult = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.DResponseBookingResult>();
            com.zhihui.order.partner.plateno.service.book.DResponseBookingResult bookResponseValueDResponseBookingResultVal1 = new com.zhihui.order.partner.plateno.service.book.DResponseBookingResult();
            bookResponseValueDResponseBookingResultVal1.setOrderNO("OrderNO-971414760");
            bookResponseValueDResponseBookingResultVal1.setMessage("Message-110805085");
            bookResponseValueDResponseBookingResult.add(bookResponseValueDResponseBookingResultVal1);
            bookResponseValue.getDResponseBookingResult().addAll(bookResponseValueDResponseBookingResult);
            bookResponse.value = bookResponseValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#modifyBookingAssureType(java.lang.String  sOrderNo ,)java.lang.String  authentication )*
     */
    public int modifyBookingAssureType(java.lang.String sOrderNo,java.lang.String authentication) { 
        LOG.info("Executing operation modifyBookingAssureType");
        System.out.println(sOrderNo);
        System.out.println(authentication);
        try {
            int _return = -564480012;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.zhihui.order.partner.plateno.service.book.BookingSoap#getForecastRoomStatus(java.lang.String  authentication ,)int  nHotelId ,)javax.xml.datatype.XMLGregorianCalendar  dtStartTime ,)javax.xml.datatype.XMLGregorianCalendar  dtEndTime ,)java.lang.String  sRoomType ,)java.lang.Integer  getForecastRoomStatusResult ,)com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatus  lstForecastRoomStatus )*
     */
    public void getForecastRoomStatus(java.lang.String authentication,int nHotelId,javax.xml.datatype.XMLGregorianCalendar dtStartTime,javax.xml.datatype.XMLGregorianCalendar dtEndTime,java.lang.String sRoomType,javax.xml.ws.Holder<java.lang.Integer> getForecastRoomStatusResult,javax.xml.ws.Holder<ArrayOfDForecastRoomStatus> lstForecastRoomStatus) { 
        LOG.info("Executing operation getForecastRoomStatus");
        System.out.println(authentication);
        System.out.println(nHotelId);
        System.out.println(dtStartTime);
        System.out.println(dtEndTime);
        System.out.println(sRoomType);
        try {
            int getForecastRoomStatusResultValue = -1448317711;
            getForecastRoomStatusResult.value = getForecastRoomStatusResultValue;
            com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatus lstForecastRoomStatusValue = new com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatus();
            java.util.List<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus> lstForecastRoomStatusValueDForecastRoomStatus = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus>();
            com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus lstForecastRoomStatusValueDForecastRoomStatusVal1 = new com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus();
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setHotelName("HotelName-2017374043");
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setHotelId(-1521283922);
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setRoomType("RoomType33758259");
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setRoomTypeName("RoomTypeName-454999061");
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setIsCanBooking(false);
            com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatusItem lstForecastRoomStatusValueDForecastRoomStatusVal1RateItems = new com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatusItem();
            java.util.List<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatusItem> lstForecastRoomStatusValueDForecastRoomStatusVal1RateItemsDForecastRoomStatusItem = new java.util.ArrayList<com.zhihui.order.partner.plateno.service.book.DForecastRoomStatusItem>();
            lstForecastRoomStatusValueDForecastRoomStatusVal1RateItems.getDForecastRoomStatusItem().addAll(lstForecastRoomStatusValueDForecastRoomStatusVal1RateItemsDForecastRoomStatusItem);
            lstForecastRoomStatusValueDForecastRoomStatusVal1.setRateItems(lstForecastRoomStatusValueDForecastRoomStatusVal1RateItems);
            lstForecastRoomStatusValueDForecastRoomStatus.add(lstForecastRoomStatusValueDForecastRoomStatusVal1);
            lstForecastRoomStatusValue.getDForecastRoomStatus().addAll(lstForecastRoomStatusValueDForecastRoomStatus);
            lstForecastRoomStatus.value = lstForecastRoomStatusValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
