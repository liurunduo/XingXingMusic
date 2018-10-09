package com.starmusic.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	
	public static String fileUpload(MultipartFile photo,String contextPath){
		int rand = (int)(Math.random()*9000)+1000;
		String fileName = System.currentTimeMillis()+""+rand+photo.getOriginalFilename();
		File file =new File(contextPath, fileName);
		try {
			photo.transferTo(file);
			return File.separator+"photo"+File.separator+fileName;
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;		
	}
}
