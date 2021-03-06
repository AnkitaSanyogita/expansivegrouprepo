package com.expansivegroup.migration.vmmigration;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class vmInstance implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "VMINSTANCE_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "VMINSTANCE_ID_SEQ", name = "VMINSTANCE_ID_GENERATOR")
   private java.lang.Long id;

   private java.math.BigInteger vmInstanceId;

   private java.lang.String name;

   private java.util.Date createdDate;

   private int memory;

   private java.lang.Boolean isActive;

   private java.lang.Boolean isRunning;

   private java.lang.String osType;

   private java.math.BigInteger hostId;

   private java.lang.Integer numberOfCores;

   public vmInstance()
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

   public java.math.BigInteger getVmInstanceId()
   {
      return this.vmInstanceId;
   }

   public void setVmInstanceId(java.math.BigInteger vmInstanceId)
   {
      this.vmInstanceId = vmInstanceId;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.util.Date getCreatedDate()
   {
      return this.createdDate;
   }

   public void setCreatedDate(java.util.Date createdDate)
   {
      this.createdDate = createdDate;
   }

   public int getMemory()
   {
      return this.memory;
   }

   public void setMemory(int memory)
   {
      this.memory = memory;
   }

   public java.lang.Boolean getIsActive()
   {
      return this.isActive;
   }

   public void setIsActive(java.lang.Boolean isActive)
   {
      this.isActive = isActive;
   }

   public java.lang.Boolean getIsRunning()
   {
      return this.isRunning;
   }

   public void setIsRunning(java.lang.Boolean isRunning)
   {
      this.isRunning = isRunning;
   }

   public java.lang.String getOsType()
   {
      return this.osType;
   }

   public void setOsType(java.lang.String osType)
   {
      this.osType = osType;
   }

   public java.math.BigInteger getHostId()
   {
      return this.hostId;
   }

   public void setHostId(java.math.BigInteger hostId)
   {
      this.hostId = hostId;
   }

   public java.lang.Integer getNumberOfCores()
   {
      return this.numberOfCores;
   }

   public void setNumberOfCores(java.lang.Integer numberOfCores)
   {
      this.numberOfCores = numberOfCores;
   }

   public vmInstance(java.lang.Long id, java.math.BigInteger vmInstanceId,
         java.lang.String name, java.util.Date createdDate, int memory,
         java.lang.Boolean isActive, java.lang.Boolean isRunning,
         java.lang.String osType, java.math.BigInteger hostId,
         java.lang.Integer numberOfCores)
   {
      this.id = id;
      this.vmInstanceId = vmInstanceId;
      this.name = name;
      this.createdDate = createdDate;
      this.memory = memory;
      this.isActive = isActive;
      this.isRunning = isRunning;
      this.osType = osType;
      this.hostId = hostId;
      this.numberOfCores = numberOfCores;
   }

}