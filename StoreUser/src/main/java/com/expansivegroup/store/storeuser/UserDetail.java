package com.expansivegroup.store.storeuser;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "userjbpm")
public class UserDetail implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "USERDETAIL_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "USERDETAIL_ID_SEQ", name = "USERDETAIL_ID_GENERATOR")
   private java.lang.Long id;

   @javax.persistence.Column(name = "name")
   private java.lang.String name;

   @javax.persistence.Column(name = "email")
   private java.lang.String email;

   public UserDetail()
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

   public UserDetail(java.lang.Long id, java.lang.String name,
         java.lang.String email)
   {
      this.id = id;
      this.name = name;
      this.email = email;
   }

}