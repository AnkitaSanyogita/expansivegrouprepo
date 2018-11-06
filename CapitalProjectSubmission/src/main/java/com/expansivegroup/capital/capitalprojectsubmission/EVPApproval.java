package com.expansivegroup.capital.capitalprojectsubmission;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class EVPApproval implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "EVPAPPROVAL_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "EVPAPPROVAL_ID_SEQ", name = "EVPAPPROVAL_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String comment;

   private java.lang.Boolean approveEVP;

   public EVPApproval()
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

   public java.lang.String getComment()
   {
      return this.comment;
   }

   public void setComment(java.lang.String comment)
   {
      this.comment = comment;
   }

   public java.lang.Boolean getApproveEVP()
   {
      return this.approveEVP;
   }

   public void setApproveEVP(java.lang.Boolean approveEVP)
   {
      this.approveEVP = approveEVP;
   }

   public EVPApproval(java.lang.Long id, java.lang.String comment,
         java.lang.Boolean approveEVP)
   {
      this.id = id;
      this.comment = comment;
      this.approveEVP = approveEVP;
   }

}