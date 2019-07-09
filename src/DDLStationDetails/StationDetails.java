package DDLStationDetails;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import DDLStationDetails.*;

public class StationDetails {
  protected NObject javonetHandle;

  public StationDetails() {
    try {
      javonetHandle = Javonet.New("DDLStationDetails.StationDetails");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StationDetails(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetAddressZIP(java.lang.String address) {
    try {
      java.lang.String res = javonetHandle.invoke("GetAddressZIP", address);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetArrivalID(java.lang.String address) {
    try {
      java.lang.String res = javonetHandle.invoke("GetArrivalID", address);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public StationDetails.ResponseInfo GetArrivalID_ZIP(java.lang.String zip) {
    try {
      Object res = javonetHandle.invoke("GetArrivalID_ZIP", zip);
      if (res == null) return null;
      return new StationDetails.ResponseInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public KTJInfo GetKerrTJ_Details(java.lang.String StationID) {
    try {
      Object res = javonetHandle.invoke("GetKerrTJ_Details", StationID);
      if (res == null) return null;
      return new KTJInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class ResponseInfo {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setZIP(java.lang.String value) {
      try {
        javonetHandle.set("ZIP", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getZIP() {
      try {
        java.lang.String res = javonetHandle.get("ZIP");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setStationName(java.lang.String value) {
      try {
        javonetHandle.set("StationName", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getStationName() {
      try {
        java.lang.String res = javonetHandle.get("StationName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setStationID(java.lang.String value) {
      try {
        javonetHandle.set("StationID", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getStationID() {
      try {
        java.lang.String res = javonetHandle.get("StationID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setArrivalID(java.lang.String value) {
      try {
        javonetHandle.set("ArrivalID", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getArrivalID() {
      try {
        java.lang.String res = javonetHandle.get("ArrivalID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setMessage(java.lang.String value) {
      try {
        javonetHandle.set("Message", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getMessage() {
      try {
        java.lang.String res = javonetHandle.get("Message");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public ResponseInfo() {
      try {
        javonetHandle = Javonet.New("DDLStationDetails.StationDetails+ResponseInfo");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ResponseInfo(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
