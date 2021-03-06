package com.expansivegroup.demo.testdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class UserName implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "USERNAME_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "USERNAME_ID_SEQ", name = "USERNAME_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String name;

   private java.lang.String email;

   public UserName()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public UserName(java.lang.Long id, java.lang.String name,
         java.lang.String email)
   {
      this.id = id;
      this.name = name;
      this.email = email;
   }

}