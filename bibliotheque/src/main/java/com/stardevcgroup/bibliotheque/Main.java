package com.stardevcgroup.bibliotheque;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {

	public static void main(String[] args) {
		
		Author auth1 = new Author("Charles", "Darwin", "Charles Darwin", Gender.MALE, 23);
		Author auth2 = new Author("Isaac", "Newton", "Isaac Newton", Gender.MALE, 33);
		Author auth3 = new Author("Galileo", "Galilei", "Galileo Galilei", Gender.MALE, 19);
		Author auth4 = new Author("Nicolaus", "Copernicus", "Nicolaus Copernicus", Gender.MALE, 22);
		Author auth5 = new Author("Aristote", "Aristote", "Aristote", Gender.MALE, 70);
		Author auth6 = new Author("Andreas", "Vesalius", "Andreas Vesalius", Gender.MALE, 42);
		Author auth7 = new Author("Albert", "Einstein", "Albert Einstein", Gender.MALE, 27);
		Author auth8 = new Author("Richard", "Dawkins", "Richard Dawkins", Gender.MALE, 38);
		Author auth9 = new Author("George", "Gamow", "George Gamow", Gender.MALE, 67);
		Author auth10 = new Author("James D.", "Watson", "James D. Watson", Gender.MALE, 33);
		Author auth11 = new Author("Carl", "Sagan", "Carl Sagan", Gender.MALE, 19);
		Author auth12 = new Author("Carl", "Sagan", "Carl Sagan", Gender.MALE, 32);
		Author auth13 = new Author("Edward O.", "Wilson", "Edward O. Wilson", Gender.MALE, 50);
		Author auth14 = new Author("Steven", "Weinberg", "Steven Weinberg", Gender.MALE, 32);
		Author auth15 = new Author("Rachel", "Carson", "Rachel Carson", Gender.MALE, 50);
		Author auth16 = new Author("Stephen Jay", "Gould", "Stephen Jay Gould", Gender.MALE, 68);
		Author auth17 = new Author("Oliver", "Sacks", "Oliver Sacks", Gender.MALE, 37);
		Author auth18 = new Author("Meriwether", "Lewis", "Meriwether Lewis and William Clark", Gender.MALE, 68);
		Author auth19 = new Author("Leighton", "Matthew Sands", "Leighton et Matthew Sands", Gender.MALE, 67);
		Author auth20 = new Author("Alfred C.", "Kinsey", "Alfred C. Kinsey et al", Gender.MALE, 39);
		Author auth21 = new Author("Dian", "Fossey", "Dian Fossey", Gender.MALE, 45);
		Author auth22 = new Author("Roy Chapman ", "Sacks", "Roy Chapman Andrews", Gender.MALE, 67);
		Author auth23 = new Author("Robert", "Hooke", "Robert Hooke", Gender.MALE, 69);
		Author auth24 = new Author("James", "Lovelock", "James Lovelock", Gender.MALE, 23);
		
		Book book1 = new Book( "The Voyage of the Beagle", auth1, 1845, "Difficile de nier que ces deux titres doivent figurer parmi les, disons, dix premières entrées de toute liste des ouvrages scientifiques les plus influents et importants de tous les temps." );
		Book book2 = new Book( "Philosophiae Naturalis Principia Mathematica", auth2, 1687, "Je l'aurais pour ma part mis en tout premier. On a du mal aujourd'hui, à se représenter l'extraordinaire impact de ce livre, de la vision du monde qu'il avançait et de tout ce qu'il a apporté sur le plan conceptuel et méthodologique. Et bien que Newton, comme il l'a dit, se soit tenu sur les épaules des géants qui l'ont précédé, la synthèse qu'il présente ici reste exemplaire." );
		Book book3 = new Book( "Dialogue sur les deux grands systèmes du monde", auth3, 1632, "Aucune objection encore une fois. Newton est impossible sans Galilée.");
		Book book4 = new Book( "De Revolutionibus Orbium Coelestium", auth4, 1543, "Ici encore, voici un livre qui doit figurer dans toute liste des ouvrages scientifiques les plus importants et influents." );
		Book book5 = new Book( "Physica", auth5, 330, "C'est contre la physique d'Aristote que Copernic, Galilée et Newton ont réagi et ont eu à se battre. Ouvrage important, donc, mais en un sens bien particulier puisqu'il a fallu lutter pour se dégager des conceptions qu'il avance. notamment dans cette version bilingue (latin-anglais)(https://www.amazon.ca/Humani-Corporis-Fabrica-Andreas-Vesalius/dp/1891788108/sr=8-3/qid=1165240385/ref=sr_1_3/702-3791893-8387209?ie=UTF8&s=books)" );
		Book book6 = new Book( "De Humani Corporis Fabrica", auth6, 1543, "C'est le premier ouvrage d'anatomie digne de ce nom. Illustré bien entendu. Il est toujours disponible," );
		Book book7 = new Book( "Relativity: The Special and General Theory", auth7, 1916, "J'ai lu beaucoup de présentations des théories de la relativité destinées au grand public, mais je pense qu'Einstein reste le meilleur vulgarisateur de ses idées. Une mise en garde: le brave homme se faisait une très, très haute idée des compétences et de la détermination à comprendre du citoyen ordinaire." );
		Book book8 = new Book( "The Selfish Gene", auth8, 1976, "Le livre par lequel Dawkins s'est fait connaître serait-il devenu un classique? J'avoue ne pas trop le savoir. Et je me demande en passant — et sans pouvoir répondre — si le concept de mème a si bien tenu la route que ça..." );
		Book book9 = new Book( "Un, deux, trois. . . l'infini", auth9, 1947, "Une des grandes joies de ma jeunesse. À mettre entre toutes les (jeunes) mains de 7 à 77 ans." );
		Book book10 = new Book( "La double hélice", auth10, 1968, "La découverte de la strcuture de l'ADN par un de ses principaux acteurs. Passionnant comme un roman, l'ouvrage comtient des passages troublants et émouvants, en particulier ceux consacrés à Rosalind Franklin." );
		Book book11 = new Book( "What Is Life?", auth11, 1944, "Oups... je ne l'ai pas lu. Je devrais, vous pensez?" );
		Book book12 = new Book( "The Cosmic Connection", auth12, 1973, "J'aime beaucoup Sagan, mais ce choix, et en cette position, tout cela me semble quelque peu excessif." );
		Book book13 = new Book( "The Insect Societies", auth13, 1971, "500 pages d'un vrai régal. Ce livre allait déboucher en 1975 sur Sociobiology: The New Synthesis, et créer la controverse que l'on sait." );
		Book book14 = new Book( "The First Three Minutes", auth14, 1977, "C'est un des livres d'astronomie que j'aurais mis plus haut, au lieu du Sagan.Weinberg est toujours clair et agréable à lire. il a aussi été un important défenseur de la rationalité dans la récente «guerre des sciences» (L'affaire Sokal et ainsi de suite...)" );
		Book book15 = new Book( "Silent Spring", auth15, 1962, "Le militant en moi aurait sans doute placé ce livre plus haut dans la liste, s'il avait été tenu de lui faire une place. Ouvrage incontournable pour le mouvement écologiste moderne, en tout cas. Et comme on le lui a fait payer cher, ce grand livre, à Mme Carson! Étrangement , et sauf erreur de ma part, il n'en existe pas de version française." );
		Book book16 = new Book( "The Mismeasure of Man", auth16, 1981, "Le célèbre et regretté biologiste, père de l'équilibre ponctué, de penche sur la notion de QI et autres questions connexes. Comprend aussi sa réaction, indignée, aux idées défendues dans le livre : The Bell Curve. Un choix défendable." );
		Book book17 = new Book( "The Man Who Mistook His Wife for a Hat and Other Clinical Tales", auth17, 1985, "Inspirant et amusant, sans aucun doute. Mais un grand livre de science? Je ne suis pas certain..." );
		Book book18 = new Book( "The Journals of Lewis and Clark", auth18, 1814, "Oups... à mettre sur ma PAL (Pile À Lire)." );
		Book book19 = new Book( "The Feynman Lectures on Physics", auth19, 1963, "Je l'aurais mis beaucoup plus haut. Selon moi, Feynman est le plus grand pédagogue de la physique. Et quel personnage, en plus! Vous saviez qu'il a, paraît-il, dit à sa femme en mourant: «Je détesterais mourir deux fois; c'est tellement ennuyant!». Fascinant et génial Feynman." );
		Book book20 = new Book( "Sexual Behavior in the Human Male", auth20, 1948, "Intéressant et important, sans doute. Mais je trouve que cette liste commence à sentir très fort l'européocentrisme et l'américanocentrisme." );
		Book book21 = new Book( "Gorillas in the Mist", auth21, 1983, "Même remarque.Je ne pense pas que sans Hollywood, ce livre figurerait sur cette liste." );
		Book book22 = new Book( "Under a Lucky Star", auth22, 1943, "Des expéditions au désert de Gobi. Roy Chapman Andrews serait l'inspiration derrière le personnage d'Indiana Jones. Quand je vous disais Hollywood..." );
		Book book23 = new Book( "Micrographia", auth23, 1665, "Le monde vu et décrit à travers un microscope. Une révolution. Mais pourquoi si bas sur la liste? Une réédition est https://www.amazon.ca/Micrographia-Robert-Hooke/dp/1891788027/sr=1-5/qid=1165259476/ref=sr_1_5/702-3791893-8387209?ie=UTF8&s=books" );
		Book book24 = new Book( "Gaia", auth24, 1979, "L'hypothèse Gaia nous conduit aux portes du New Age et on peut se demande si ce choix est réellement judicieux" );
	
		List<Author> authors = new ArrayList<Author>();
		authors.add(auth1);
		authors.add(auth2);
		authors.add(auth3);
		authors.add(auth4);
		authors.add(auth5);
		authors.add(auth6);
		authors.add(auth7);
		authors.add(auth8);
		authors.add(auth9);
		authors.add(auth10);
		authors.add(auth11);
		authors.add(auth12);
		authors.add(auth13);
		authors.add(auth14);
		authors.add(auth15);
		authors.add(auth16);
		authors.add(auth17);
		authors.add(auth18);
		authors.add(auth19);
		authors.add(auth20);
		authors.add(auth21);
		authors.add(auth22);
		authors.add(auth23);
		authors.add(auth24);
	
	}

}
