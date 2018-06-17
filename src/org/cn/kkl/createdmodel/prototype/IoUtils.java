package org.cn.kkl.createdmodel.prototype;

import java.io.Closeable;
import java.io.IOException;

public class IoUtils {
	
	public static void closeAllIo(Closeable ... io){
		for (Closeable stream : io) {
			if(stream!=null){
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
