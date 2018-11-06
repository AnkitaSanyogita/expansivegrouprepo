package com.expansivegroup.declaration.investmentdeclaration;

import com.google.common.collect.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.math.BigDecimal;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class InvestmentInstrument implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "INVESTMENTINSTRUMENT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "INVESTMENTINSTRUMENT_ID_SEQ", name = "INVESTMENTINSTRUMENT_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Income Tax Relief Section")
   @org.kie.api.definition.type.Position(1)
   private java.lang.String income_Tax_Relief_Section;

   private java.lang.Integer invsetmentCategory;

   public InvestmentInstrument()
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

   public java.lang.String getIncome_Tax_Relief_Section()
   {
      return this.income_Tax_Relief_Section;
   }

   public void setIncome_Tax_Relief_Section(
         java.lang.String income_Tax_Relief_Section) throws SQLException

   {

      this.income_Tax_Relief_Section = income_Tax_Relief_Section;
      Connection c = null;
      Statement stmt = null;
      try
      {
         Class.forName("org.postgresql.Driver");
      }
      catch (ClassNotFoundException e)
      {
         e.printStackTrace();
      }
      System.out.println("Before  Driver In Investment");
      c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mytest", "postgres", "espl@2017");
      System.out.println("After  Driver");
      stmt = c.createStatement();
      System.out.println("In setIncome_Tax_Relief_Sectio" + getInvsetmentCategory());
      String sql = "INSERT INTO InvestmentInstrument (investment_category_id,income_tax_relief_section)values(" + getInvsetmentCategory() + ",'" + getIncome_Tax_Relief_Section() + "')";

      System.out.println(sql);
      stmt.executeUpdate(sql);

      c.close();
      stmt.close();

   }

   public java.lang.Integer getInvsetmentCategory()
   {
        System.out.println(" In getInvsetmentCategory() before"+this.invsetmentCategory);
      return this.invsetmentCategory;
       
   }

   public void setInvsetmentCategory(java.lang.Integer invsetmentCategory)
   {
         System.out.println(" In setInvsetmentCategory() before"+this.invsetmentCategory);
      this.invsetmentCategory = invsetmentCategory;
   }

   public InvestmentInstrument(java.lang.Long id,
         java.lang.String income_Tax_Relief_Section,
         java.lang.Integer invsetmentCategory)
   {
      this.id = id;
      this.income_Tax_Relief_Section = income_Tax_Relief_Section;
      this.invsetmentCategory = invsetmentCategory;
   }

   public InvestmentInstrument(java.lang.String income_Tax_Relief_Section)
   {
      this.income_Tax_Relief_Section = income_Tax_Relief_Section;
   }
}