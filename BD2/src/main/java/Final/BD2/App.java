package Final.BD2;

//import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Final.BD2.model.Application;
import Final.BD2.model.User;
import Final.BD2.model.Video;

public class App 
{
	protected static Session session;
	protected static Application app;

	public static Session getSession() {
		if (session == null) {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			SessionFactory factory = config.buildSessionFactory();
			session = factory.openSession();
		}
		return session;
	}

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Cargo la session
		getSession();


		// Creo la aplicacion
	
		app= new Application();
		
		//creo los usuarios
		
		app.createUser("Maria", "1234");
		app.createUser("Julio", "1234");
		app.createUser("Simon", "1234");
		app.createUser("Ambar", "1234");
		app.createUser("Federica", "1234");
		app.createUser("Timoteo", "1234");
		
		//creo videos
		User maria = app.getUserByName("Maria");
		maria.createVideo("Im yours", "Jason Mraz", "Canción del álbum de estudio We Sing. We Dance. We Steal Things. (2008)");
		
		User julio = app.getUserByName("Julio");
		julio.createVideo("We are the world", "Michael Jackson", "canción escrita por Michael Jackson y Lionel Richie en 1985, grabada por un gran grupo de músicos famosos. Los beneficios obtenidos por la canción fueron donados a una campaña humanitaria para intentar acabar con la tremenda hambruna en Etiopía.");
		
		User simon = app.getUserByName("Simon");
		simon.createVideo("Where is the love","Black eyed peas","Where is de Love fue lanzada 31 de agosto de 2016, en colaboración con un gran número de artistas de la industria de la música. Los beneficios serán cedidos a diferentes programas educativos.");
		
		User ambar = app.getUserByName("Ambar");
		ambar.createVideo("Hey jude", "The Beatles", "La escribió Paul McCartney para consolar a Julian, el hijo de John Lennon, del divorcio de sus padres");
		
		User federica = app.getUserByName("Federica");
		federica.createVideo("Massachusetts", "Bee Gees", "Fue el primer gran exito de los Bee Gees ya que logró alcanzar la cima de las listas Británicas y ello hizo que los hermanos Gibbs, con sus melódicas canciones, se hicieran populares y el mundo musical empezara a mirarlos y escucharlos con mucha atención.");
		
		User timoteo = app.getUserByName("Timoteo");
		timoteo.createVideo("Stayin alive", "Bee Gees", "Exitosa canción disco de los Bee Gees compuesta para la banda sonora de la película Saturday Night Fever (Fiebre del sábado por la noche) y lanzada como segundo sencillo el 13 de septiembre de 1977");
		
		
		//Busco videos, los comento y puntuo
		
		Video video1 = app.getVideoByName("We are the world");
		video1.comment(timoteo, "excelente historia");
		video1.scoreVideo(10, timoteo);
		video1.scoreVideo(8, ambar);
		video1.scoreVideo(9, federica);
		
		Video video2 = app.getVideoByName("Massachusetts");
		video2.comment(federica, "La mejor canción de este hermoso grupo");		
		video2.scoreVideo(9, simon);
		video2.scoreVideo(9, julio);
		video2.scoreVideo(9, maria);
		video2.scoreVideo(10, federica);
		
		session.beginTransaction();
		session.save(app);
		session.getTransaction().commit();
	}
}
