package com.redhat.vizuri.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PushNotification implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private com.redhat.vizuri.insurance.Message message;

   public PushNotification()
   {
   }

   public com.redhat.vizuri.insurance.Message getMessage()
   {
      return this.message;
   }

   public void setMessage(com.redhat.vizuri.insurance.Message message)
   {
      this.message = message;
   }

   public PushNotification(com.redhat.vizuri.insurance.Message message)
   {
      this.message = message;
   }

}