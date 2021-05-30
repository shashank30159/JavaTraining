package com.vm.training.java.AssignmentOnCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class FileIoAssignment
{
	
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("F:\\Personal\\valuemomentum\\Assignments\\States.txt");
		BufferedReader br=new BufferedReader(fr);
		Set<FileReader> lhs=new LinkedHashSet<FileReader>();
		lhs.add(fr);
		String readlines=br.readLine();
		while(readlines!=null)
		{
			System.out.println(readlines);
			readlines=br.readLine();
			
		}		
		
		for (FileReader bufferedReader : lhs) {
			System.out.println(bufferedReader);
		}
	}

}
