
/**
* InvalidQTYHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from StockControlInterface.idl
* Tuesday, 16 February 2010 00:39:54 o'clock GMT
* 
* Sample program for use with IBM Integration Bus
* � Copyright International Business Machines Corporation 2010 
* Licensed Materials - Property of IBM
*/

public final class InvalidQTYHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidQTY value = null;

  public InvalidQTYHolder ()
  {
  }

  public InvalidQTYHolder (InvalidQTY initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidQTYHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidQTYHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidQTYHelper.type ();
  }

}