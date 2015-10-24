package io.foo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Deque;

public class Foo {

	public static void reverseFiftyLines() {
		try {
			long start = System.currentTimeMillis();
			Deque<String> stack = new ArrayDeque<String>();
			String line = null;

			URL in = Foo.class.getResource("/input.txt");
			File input = new File(in.toURI());
			FileReader fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);

			URL out = Foo.class.getResource("/output2.txt");
			File output = new File(out.toURI());
			FileWriter fw = new FileWriter(output);
			BufferedWriter bw = new BufferedWriter(fw);

			boolean done = false;
			while (!done) {
				for (int i = 0; i < 50; i++) {
					line = br.readLine();
					if (line != null) {
						stack.push(line);
					} else {
						done = true;
					}
				}
				for (int i = 0; i < 50; i++) {
					line = stack.pollFirst();
					if (line != null) {
						bw.write(line + "\n");
					}
				}
			}
			br.close();
			bw.close();
			System.out.println(String.format("Run time: %dms",
					System.currentTimeMillis() - start));
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void reverseLines() {
		try {
			long start = System.currentTimeMillis();
			Deque<String> stack = new ArrayDeque<String>();
			String line = null;

			URL in = Foo.class.getResource("/input.txt");
			File input = new File(in.toURI());
			FileReader fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				stack.push(line);
			}
			br.close();

			URL out = Foo.class.getResource("/output.txt");
			File output = new File(out.toURI());
			FileWriter fw = new FileWriter(output);
			BufferedWriter bw = new BufferedWriter(fw);
			while ((line = stack.pollFirst()) != null) {
				bw.write(line);
				bw.write("\n");
			}
			bw.close();
			System.out.println(String.format("Run time: %dms",
					System.currentTimeMillis() - start));
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}

	}

}
