package com.shs.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileReadInfiniteLoop {

	public static void main(String[] args) throws IOException, InterruptedException {
		for(;;) {
		File source=new File("D:\\input");
			String[] listoffiles=source.list();
			for (String string : listoffiles) {
				//Thread.sleep(30000);
				File sourceFile=new File("D:\\input\\"+string);
				File destFile=new File("D:\\output\\"+string);
				Thread.sleep(3000);
				FileUtils.copyFile(sourceFile, destFile);
			}
			Thread.sleep(3000);
			FileUtils.cleanDirectory(source);
		}
	}
}
