package org.mltk.mahout.util;

import org.apache.mahout.cf.taste.model.DataModel;
import org.mltk.mahout.util.load.impl.LoadFileTasteDataImpl;

public class DataModelUtil {

	/**
	 * 从磁盘文件中载入数据模型
	 * 
	 * @param flagFileModel
	 * @param filePath
	 * @return
	 */
	public static DataModel loadDataModelFromFile(String filePath) {

		// 从磁盘文件中载入数据
		DataModel fileModel = new LoadFileTasteDataImpl(filePath)
				.loadDataFromOutRes();

		return fileModel;
	}
}
