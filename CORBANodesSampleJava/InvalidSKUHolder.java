
/**
* InvalidSKUHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from StockControlInterface.idl
* Tuesday, 16 February 2010 00:39:54 o'clock GMT
* 
* Sample program for use with IBM Integration Bus
* � Copyright International Business Machines Corporation 2010 
* Licensed Materials - Property of IBM
*/

public final class InvalidSKUHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidSKU value = null;

  public InvalidSKUHolder ()
  {
  }

  public InvalidSKUHolder (InvalidSKU initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidSKUHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidSKUHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidSKUHelper.type ();
  }

}