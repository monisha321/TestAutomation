package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Projects extends Initialization {
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath( "//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath( "/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("project1");
			Thread.sleep(3000);
			
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void modifyProject()
	{
		try
		{
			oBrowser.findElement(By.xpath( "//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath( "//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("new project");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void deleteProject()
	{
		try
		{oBrowser.findElement(By.xpath( "//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath( "//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitBtn']/div")).click();
		Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
