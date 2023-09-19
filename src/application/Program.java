package application;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		List<Post> listPost = new ArrayList<>();
		Post post = null;
		
		System.out.print("Digite a quantidade de post que voce quer criar: ");
		int nPost = sc.nextInt();
		System.out.println("Digite o title, comment e os likes do seus posts: ");
		sc.nextLine();
		
				
		for(int i = 1 ; i <= nPost; i++) {
			System.out.println("Post #" + i + ": ");
			System.out.print("Title: ");
			String title = sc.nextLine();
			System.out.print("Content: ");
			String content = sc.nextLine();
			System.out.print("Likes: ");
			int likes = sc.nextInt();
			post = new Post(LocalDateTime.now(),title,content,likes);	
			System.out.println();
			System.out.print("Quantos comentarios deseja adicionar no post " + i + "? ");
			int qntComment = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			for(int j = 1 ; j <= qntComment; j++) {
				System.out.println("Comment #" + j + " do post #" + i);
				System.out.print("insira o comentario: ");
				String commentUser = sc.nextLine();
				post.addComments(new Comment(commentUser));	
				System.out.println();
			}
				listPost.add(post);			
		}
		
		
		System.out.println();
		int count = 1;
		System.out.println("------Todos post e comentarios------");
		System.out.println();
		for(Post pos: listPost) {
			System.out.println("------Post #" + count + "--------");
			System.out.print(pos);
			System.out.println();
			count++;	
		}
		
		
	

		

	}

}
