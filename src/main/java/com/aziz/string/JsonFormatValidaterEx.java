package com.aziz.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class JsonFormatValidaterEx {
	 private String brackets;

	    public JsonFormatValidaterEx(String s) {
	        brackets = s;
	    }
	
	/*public boolean validate() {
        boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        char current, previous;
        for(int i = 0; i < this.brackets.length(); i++) {
            current = this.brackets.charAt(i);
            if(current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if(current == ')' || current == ']' || current == '}') {
                if(stack.isEmpty()) {
                    result = false;
                } else {
                    previous = stack.peek();
                    if((current == ')' && previous == '(') || (current == ']' && previous == '[') || (current == '}' && previous == '{')) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            result = false;
        }
        return result;
    }*/

	public static boolean isValid(String s) {
		/*HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack<Character> stack = new Stack<Character>();
		for (Character curr:s.toCharArray()) {
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.empty();*/
		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		Stack<Character> stack = new Stack<>();
		for(Character ch : s.toCharArray()){
			if(map.keySet().contains(ch)) {
				stack.push(ch);
			}else if(map.values().contains(ch)) {
				if(!stack.empty() && map.get(stack.peek())== ch) {
					stack.pop();
				}else {
					return false;
				}
				
			}
		}
		return stack.empty();
		
	}

	public static void main(String[] args) {
		//String str = "{'name':[1], 'objet':{id:223 }";
		String str = "{'}dd{lllll}";
		System.out.println(isValid(str));
		
		//JsonFormatValidaterEx b = new JsonFormatValidaterEx("}{{{{[({}())]}") ;
		//System.out.println("Valid String: " + b.validate());
		
		/*
		 * char[] ch = str.toCharArray(); int startCount = 0; int endCount = 0; for
		 * (Character c : ch) { if (c == '{') { startCount++; } if (c == '}') {
		 * endCount++; } } if (startCount == endCount) {
		 * System.out.println("This is valid string"); } else {
		 * System.out.println("This is invalid String"); }
		 */
	}

}
