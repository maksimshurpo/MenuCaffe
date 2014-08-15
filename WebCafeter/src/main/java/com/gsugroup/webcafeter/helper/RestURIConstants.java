package com.gsugroup.webcafeter.helper;

/**
 * Created by Maksim_Shurpo on 7/21/2014.
 */
public class RestURIConstants {

    public interface DomainURI{
        public static final String DOMAIN = "cafeter";
        public static final String DOMAIN_DEVICE = DOMAIN + "/device";
        public static final String ORDER_DOMAIN = DOMAIN + "/order";
    }

    public interface CommonURI{
        public static final String sortParam = "sort";
        public static final String sortColumnParam = "sortColumn";
        public static final String offsetParam = "offset";
        public static final String countParam = "count";

        public static final String id = "/{id}";
    }

    public interface DeviceURI extends CommonURI {
        public static final String addDevice = "addDevice";
        public static final String getDeviceInfo = "getDeviceInfo";
    }

    public interface OrderURI extends CommonURI {
        public static final String getOrders = "getOrders";
        public static final String createOrder = "createOrder";
        public static final String updateOrder = "updateOrder";
        public static final String deleteOrder = "deleteOrder";
    }
}
