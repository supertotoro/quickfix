package org.quickfix.field; 
import org.quickfix.IntField; 
import java.util.Date; 

public class ListStatusType extends IntField 
{ 
  public static final int FIELD = 429; 
public static final int ACK = 1; 
public static final int RESP = 2; 
public static final int TIMED = 3; 
public static final int EXEC_START = 4; 
public static final int ALL_DONE = 5; 
public static final int ALERT = 6; 

  public ListStatusType() 
  { 
    super(429);
  } 
  public ListStatusType(int data) 
  { 
    super(429, data);
  } 
} 
