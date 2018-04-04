package in.ebc.searchviewdemotwo;

/**
 * Created by EBC003 on 12/12/2017.
 */

public class Constants {

    public static final int TYPE_WIFI=1;
    public static final int TYPE_MOBILE=2;
    public static final int TYPE_NOT_CONNECTED=0;

    public static final String USER_EMAIL="user_email";
    public static final String USER_PASSWORD="user_password";
    public static final String USER_ID_NAME="customer_id_name";
    public static final String METHOD_POST="POST";
    public static final String METHOD_GET="GET";

    public static final String URL_LOGIN="http://www.ebusinesscanvas.com/tripolarcon/android_app/login_form.php";

    //EMP Table Details
    public static final String EMP_ID="register_id";
    public static final String USER_NAME="user_name";
    public static final String PREFERENCE_KEY="com.example.ebc003.tripolarcon";

    public static final String FRAG_HOME="fragHome";
    public static final String FRAG_LEADS="fragLeads";
    public static final String FRAG_REMINDER="fragReminder";
    public static final String FRAG_ADD_LEAD="fragAddLead";

    public static final String USER_ID="id";
    public static final String COMPANY_NAME="company_name";
    public static final String LOG_IMG_PATH="log_img_path";
    public static final String ADDRESS="address";
    public static final String PHONE_NO="phone_no";
    public static final String WEB_SITE="web_site";
    public static final String GST_NO="gst_no";
    public static final String STATE="state";
    public static final String URL_INSERT_LEAD="http://www.ebusinesscanvas.com/tripolarcon/android_app/add_lead_details.php";
    public static final String REQUEST_STATUS="success";

    public static final String URL_SHOW_LEAD_LIST="http://www.ebusinesscanvas.com/tripolarcon/android_app/lead_list_show.php";
    public static final String URL_SHOW_FRAGMENT_LEAD_LIST="http://www.ebusinesscanvas.com/tripolarcon/android_app/lead_data.php";
    public static final String URL_SHOW_LOG_DETAIL="http://www.ebusinesscanvas.com/tripolarcon/android_app/show_log_detail.php";
    public static final String URL_SHOW_LEAD_DETAIL_INFO="http://www.ebusinesscanvas.com/tripolarcon/android_app/lead_detail_info.php";
    public static final String URL_SHOW_TRADING_INFO="http://www.ebusinesscanvas.com/tripolarcon/android_app/trading_detail.php";
    public static final String URL_SHOW_TRADING_SERVICE_INFO="http://www.ebusinesscanvas.com/tripolarcon/android_app/trading_service_detail.php";
    public static final String URL_ADD_LOG="http://www.ebusinesscanvas.com/tripolarcon/android_app/add_log.php";
    public static final String URL_EDIT_TRADING_DETAILS="http://www.ebusinesscanvas.com/tripolarcon/android_app/edit_trading_details.php";
    public static final String URL_EDIT_TRADING_SERVICES_DETAILS="http://www.ebusinesscanvas.com/tripolarcon/android_app/edit_trading_services.php";
    public static final String URL_SHOW_TODAY_PLAN="http://www.ebusinesscanvas.com/tripolarcon/android_app/show_today_plan.php";
    public static final String URL_SHOW_TOMORROW_PLAN="http://www.ebusinesscanvas.com/tripolarcon/android_app/show_tomorrow_plan.php";
    public static final String server_image_path = "http://www.ebusinesscanvas.com/tripolarcon/android_app/AddLogData/";

    public static final String ORDER_DATE="order_date";
    public static final String ORDER_DETAIL_ID="order_details_id";
    public static final String BRAND_ID="brand_id";
    public static final String PRO_ID="pro_id";
    public static final String SOURCE_ID="source_id";
    public static final String ENQUIRE_STATUS_ID="enquiry_status_id";
    public static final String ENQUIRE_ACTION_ID="enquiry_action_id";
    public static final String REQUIREMENT_REMARK="requirment_remark";
    public static final String FOLLOW_UP_ID="followup_id";
    public static final String ASSIGN_TO = "assign_to";
    public static final String GENERATED_BY = "generated_by";

    public static final String ORDER_DESCRIPTION="order_ser_description";
    public static final String AREA="ser_area";
    public static final String UNIT="unit_id";

    public static final String LOG_SCHEDULE = "add_schedule";
    public static final String SHOW_LOG_SCHEDULE = "sche_type";
    public static final String LOG_SCHEDULE_TIME = "add_schedule_time";
    public static final String LOG_SCHEDULE_DATE = "add_schedule_date";
    public static final String LOG_DATE = "add_date";
    public static final String LOG_TIME = "add_time";
    public static final String LOG_REMARK = "add_remark";
    public static final String LOG_CALL_TYPE = "en_call_type";
    public static final String LOG_STATUS = "en_status";
    public static final String SHOW_LOG_DATE="sche_date";
    public static final String SHOW_LOG_TIME="sche_time";
    public static final String SHOW_LOG_REMARK="en_remark";
    public static final String SHOW_PLAN_DATE="cur_date";
    public static final String SHOW_PLAN_TIME="cur_time";
    public static final String CUSTOMER_ID="customer_id";
    public static final String LOG_DATETIME = "datetime";

    public static final String emailPattern = "[a-zA-Z0-9._-]+@[a-z._-]+\\.+[a-z]+";
    public static final String regEx = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
    public static final String RESPONSE_STATUS = "status";
    public static final String RESPONSE_STATUS_FAIL = "fail";

    public static final String FILE_UPLOAD_URL="http://www.ebusinesscanvas.com/tripolarcon/android_app/file_upload_log_generate.php";
    public static final String ASSIGN_TO_NAME = "assign_to_name";
    public static final String GENERATED_BY_NAME = "generated_by_name";
    public static final String FRAG_DASHBOARD = "frag_dashboard";
    public static final String CONTACT_PERSON = "contactPerson";

    public static final String CONTACT_DESIGNATION = "contactDesignation";
    public static final String CITY = "city";
    public static final String FAX_NUMBER = "FAX_Number";
    public static final String PAN_NUMBER = "PAN_Number";
    public static final String NOTE = "note";
    public static final String SOURCE = "source";
    public static final String NO_DATA = "no_data";

    public static final String TRADING_BRAND_NAME = "trading_brand_name";
    public static final String TRADING_PRODUCT_NAME = "trading_product_name";
    public static final String TRADING_SOURCE_TYPE = "trading_source_type";
    public static final String TRADING_ENQUIRY_STATUS = "trading_enquiry_status";
    public static final String TRADING_ENQUIRY_ACTION = "trading_enquiry_action";
    public static final String TRADING_FOLLOWUP = "trading_follow_up";
    public static final String TRADING_REMARK = "trading_remark";

    public static final String TRADING_SERVICE_ORDER_DESCRIPTION = "trading_service_order_description";
    public static final String TRADING_SERVICE_AREA = "trading_service_area";
    public static final String TRADING_SERVICE_UNIT = "trading_service_unit";
    public static final String TRADING_SERVICE_SOURCE_TYPE = "trading_service_source_type";
    public static final String TRADING_SERVICE_ENQUIRY_STATUS = "trading_service_enquiry_status";
    public static final String TRADING_SERVICE_ENQUIRY_ACTION = "trading_service_enquiry_action";
    public static final String TRADING_SERVICE_FOLLOWUP = "trading_service_follow_up";
    public static final String TRADING_SERVICE_REMARK = "trading_service_remark";

    public static final String URL_NOTIFICATION_DETAILS = "http://www.ebusinesscanvas.com/tripolarcon/android_app/notification_details.php";
}
