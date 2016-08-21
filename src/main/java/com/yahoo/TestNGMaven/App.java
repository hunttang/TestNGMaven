package com.yahoo.TestNGMaven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class App
{
	public static void main(String[] args) throws JSONException
	{
        /*
		JSONObject json = new JSONObject();
		HashSet<String> set = new HashSet<String>();
		set.add("ABC");
		set.add("XYZ");
		
		json.put("source", set);
		json.put("string", "testString");
		
		JSONArray arrayGet = (JSONArray)json.get("source");
		Object setGet = json.get("source");
		Object stringGet = json.get("string");
		
		System.out.println(arrayGet.toString());
		System.out.println(set.toString());
		System.out.println(stringGet.getClass().toString());
		*/
	}

	public int Add(int a, int b)
	{
		return a + b;
	}

	public int Sub(int a, int b)
	{
		return a - b;
	}
	
	public static int Multiply(int a, int b)
	{
		return a * b;
	}
	
	public int TestVerify(ArrayList<Integer> intArray, Math math)
	{
		int nSum = math.AddArray(intArray);
		return nSum;
	}
}
