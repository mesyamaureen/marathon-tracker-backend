# Marathon Training Tracker Website
Das Repo zum Frontend findet man [hier](https://github.com/mesyamaureen/marathon-tracker-frontend)

## Über die App
Für ein Marathon muss sich ein Läufer ständig dafür trainieren. Um den Trainingsplan regelmäßig zu verfolgen, dient diese App zum Hilfsmittel für Läufer während des Marathon-Trainingsblocks. 

## Was leistet die App?
- Läufer kann viele geplante Läufe erstellen, einsehen, bearbeiten und löschen.
- Läufer kann einen erledigten Lauf erstellen, einsehen, bearbeiten und löschen.
- Sobald der geplante Lauf erledigt ist, zeigt die App dem Läufer den Status des Laufs.

## Wie führt man die App aus?

Ausführen einer Spring Boot-Anwendung mit **Gradle** und **IntelliJ IDEA**
Voraussetzungen:
- Installierte Java Development Kit (JDK) (Version kompatibel mit deiner Spring Boot-Version)
- Installierte IntelliJ IDEA IDE
- Installiertes Gradle Build-Tool (optional, da IntelliJ IDEA Gradle gebündelt enthält)
  
Schritte:
1. Repository klonen
```ruby
git clone <Repository-URL>
cd <Verzeichnis-des-Repositorys>
```

## Projekt in IntelliJ IDEA öffnen

- Öffne IntelliJ IDEA.
- Wähle Datei -> Öffnen und navigiere zum geklonten Projektverzeichnis.
- Klicke auf Öffnen oder OK, um das Projekt zu öffnen.
  
### JDK in IntelliJ IDEA konfigurieren

Falls das JDK nicht automatisch erkannt wird, konfiguriere es in IntelliJ IDEA:
- Gehe zu Datei -> Projektstruktur.
- Unter Projekteinstellungen wähle Projekt.
- Setze das Projekt-SDK auf deine installierte JDK-Version.
- Klicke auf OK.
  
### Gradle-Projekt importieren
- IntelliJ IDEA sollte die Gradle-Dateien (build.gradle) automatisch erkennen.
- Falls nicht oder zur Aktualisierung, gehe zu Datei -> Neu -> Projekt aus vorhandenen Quellen.
- Wähle die build.gradle-Datei in deinem Projektverzeichnis aus.
- Klicke auf OK und folge den Anweisungen, um das Projekt zu importieren.

### Spring Boot-Anwendung ausführen
- Navigiere zur Hauptklasse deiner Anwendung (normalerweise mit @SpringBootApplication annotiert).
- Klicke mit der rechten Maustaste auf die Klasse oder öffne sie und klicke auf den grünen Pfeil ▶️ neben der main-Methode.
- Wähle Ausführen <DeineHauptklasse>, um die Spring Boot-Anwendung zu starten.

### Zugriff auf die Anwendung

- Sobald die Anwendung gestartet ist, öffne einen Webbrowser und gehe zu http://localhost:8080 (oder den konfigurierten Port, falls anders).
- Du solltest die Standard-Spring Boot Willkommensseite oder die Startseite deiner Anwendung sehen.
Anwendung stoppen

Um die Anwendung zu stoppen, gehe zurück zu IntelliJ IDEA und klicke auf die Stopp-Schaltfläche im Run-Tool-Fenster oder drücke Strg+C im Terminal, falls von dort aus ausgeführt.
