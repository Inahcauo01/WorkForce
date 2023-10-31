# WorkForce

## L'injection de dependances
 l'injection de dépendances est un concept essentiel de Spring qui permet de gérer les dépendances entre les classes de manière automatique et efficace. Cela simplifie le code et facilite la maintenance de l'application. Il existe plusieurs méthodes d'injection de dépendances, telles que l'injection par constructeur, l'injection par setter et l'utilisation de l'annotation @Autowired. En comprenant ces concepts, les étudiants seront en mesure de développer des applications Spring robustes et modulaires.
 #### exemple
 Voici un exemple d'injection de dépendance entre un service et un repository 
 classe employé :
 ```java
public class Employé {
    private Long id;
    private String nom;
    private double salaire;
    // Getters et setters
}
```
repository :
 ```java
public interface EmployéRepository extends CrudRepository<Employé, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
```
service :
 ```java
@Service
public class ServiceEmployé {
    private final EmployéRepository employéRepository;

    @Autowired
    public ServiceEmployé(EmployéRepository employéRepository) {
        this.employéRepository = employéRepository;
    }

    public Employé créerEmployé(Employé employé) {
        return employéRepository.save(employé);
    }
    // ...
}
```
## IOC 
Inversion de controle signifie que le contrôle sur la création et la gestion des objets est inversé<br>
c'est-à-dire qu'au lieu que votre code crée directement les objets dont il a besoin, c'est un conteneur (Spring container) qui crée et gère ces objets pour vous.<br>
En résumé, IoC dans le contexte du Spring Framework signifie que le framework prend en charge la création, la configuration et la gestion des objets de votre application, réduisant ainsi la complexité de votre code et favorisant une meilleure séparation des préoccupations.

## Conteneur Spring
Un conteneur Spring est une partie centrale du framework Spring qui gère la configuration, la création et la gestion des objets (beans) de votre application.<br> Ce conteneur est responsable de l'application du principe d'Inversion de Contrôle (IoC) en gérant les dépendances entre les objets, leur cycle de vie, et en fournissant les instances d'objets lorsque c'est nécessaire.
à travers 
<ol>
 <li>
  Fichier XML
  
 </li>
 <li>
  Annotations
  
 </li>
</ol>

## Bean scopes
<ul>
 <li>
  singleton : (Default) Scopes a single bean definition to a single object instance for each Spring IoC container.
 </li>
 <li>
  prototype : Scopes a single bean definition to any number of object instances.
 </li>
 request, session, application ...
</ul>

## AOP
L'Aspect-Oriented Programming (AOP) sert à gérer efficacement les préoccupations transversales ou les préoccupations qui traversent plusieurs parties de votre application sans encombrer ni perturber le code métier central. <br>
#### exemple 
````java
import org.springframework.context.annotation.*;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before method execution: " + joinPoint.getSignature());
    }
}

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    // Configuration pour activer l'AOP dans Spring
}
````

