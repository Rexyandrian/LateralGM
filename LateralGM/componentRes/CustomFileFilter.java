package componentRes;

import java.io.File;
import java.util.ArrayList;

import javax.swing.filechooser.FileFilter;

public class CustomFileFilter extends FileFilter
	{
	private ArrayList<String> ext = new ArrayList<String>();
	private String desc;

	public CustomFileFilter(String ext, String desc)
		{
		this.ext.add(ext);
		this.desc = desc;
		}

	public CustomFileFilter(String[] ext, String desc)
		{
		for (int m = 0; m < ext.length; m++)
			{
			this.ext.add(ext[m]);
			}
		this.desc = desc;
		}

	public boolean accept(File f)
		{
		if (ext.size() == 0) return true;
		if (f.isDirectory()) return true;
		String s = f.getPath();
		for (String e : ext)
			{
			if (s.endsWith(e))
				return true;
			}
		return false;
		}

	public String getDescription()
		{
		return desc;
		}
	}