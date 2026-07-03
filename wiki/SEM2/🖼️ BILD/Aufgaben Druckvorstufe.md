---
tags:
  - sem2
  - bild
type: exercise
sources:
  - Übungsaufgaben.pdf
date: 2026-05-06
updated: 2026-07-03
---
**06.05.26**

# Aufgaben zur Druckvorstufe

> [!info] Theoretische Grundlagen zu diesem Thema: [[4. Preprint]]
> Verwandte Grundlagen zu Histogramm, Bit-/Farbtiefe: [[6. Histogramme]], [[1. Digitale Bilder Grundbegriffe]] (BIDRU)

## 1. Scan

### 1.1 Basis

> [!todo]
> (1) Welche Auflösung ist für Magazinscans im Offsetdruck üblich?

Für den Offsetdruck von Magazinen sind **300 ppi** (bezogen auf die Endgröße im Druck) der übliche Zielwert, da dies bei den im Offsetdruck typischen Rasterweiten (~60 L/cm) ein scharfes, moiréfreies Ergebnis liefert.

> [!todo]
> (2) Was bedeutet optische Auflösung?

Die **optische Auflösung** ist die tatsächlich durch die Sensorik (Anzahl und Abstand der lichtempfindlichen Elemente) physisch erfasste Auflösung eines Scanners, im Gegensatz zur interpolierten Auflösung, die rechnerisch durch Software hochgerechnet wird.

> [!todo]
> (3) Warum ist TIFF für Scans geeignet?

**TIFF** speichert verlustfrei (unkomprimiert oder verlustfrei komprimiert, z.B. LZW) und unterstützt hohe Bit-Tiefen, CMYK/RGB, Farbprofile (ICC) sowie Ebenen. Da Scans als unverändertes Digitaloriginal archiviert werden sollen (siehe [[4. Preprint#4.1.2 Erfassung von Bestandsmedien|Erfassung von Bestandsmedien]]), verhindert das verlustfreie Format Qualitätsverluste durch wiederholtes Speichern.

> [!todo]
> (4) Was ist Moiré?

**Moiré** ist ein Interferenzmuster, das entsteht, wenn sich zwei regelmäßige Raster (z.B. das Druckraster einer Vorlage und das Abtastraster des Scanners, oder das Scanraster und das spätere Druckraster) überlagern und dabei ein neues, störendes Muster erzeugen.

> [!todo]
> (5) Warum RGB statt CMYK beim Scannen?

Scanner erfassen Licht additiv über RGB-Sensoren – das ist ihr natives Farbmodell. Eine CMYK-Wandlung ist ein subtraktives Modell, das für die Ausgabe (Druck) gedacht ist und beim Scannen unnötige, verlustbehaftete Umrechnungen sowie eine Beschränkung des Farbraums vor der eigentlichen Bildbearbeitung erzeugen würde.

### 1.2 Mittel

> [!todo]
> (6) Unterschied interpolierte vs. optische Auflösung?

- **Optische Auflösung:** durch die Sensorhardware physisch gemessene Auflösung (reale Bildinformation).
- **Interpolierte Auflösung:** rechnerisch durch Software zwischen vorhandenen Pixeln erzeugte, geschätzte Zusatzauflösung – sie erhöht die Pixelanzahl, nicht aber die tatsächliche Detailschärfe.

> [!todo]
> (7) Einfluss Vorlagengröße auf Scanauflösung?

Je kleiner die Vorlage im Verhältnis zur benötigten Endgröße ist, desto höher muss die Scanauflösung gewählt werden, da beim Hochskalieren auf die Zielgröße die effektive ppi-Zahl sinkt. Der benötigte Scan-ppi-Wert ergibt sich aus: Ziel-ppi × (Endgröße / Vorlagengröße).

> [!todo]
> (8) Was ist $D_{max}$?

$D_{max}$ ist die maximale **Dichte** (optische Schwärzung), die ein Scanner in den dunkelsten Bildbereichen noch differenziert erfassen kann. Ein höherer $D_{max}$-Wert bedeutet mehr erkennbare Zeichnung in Schatten- bzw. Tiefendetails, besonders relevant beim Scannen von Dias/Negativen.

> [!todo]
> (9) Wie vermeidet man Moiré?

Leichtes Verdrehen des Scanwinkels relativ zum Vorlagenraster, Anwendung eines Entrasterungsfilters (Descreening) beim Scan, oder Scannen mit deutlich höherer Auflösung als für die Ausgabe nötig und anschließendes kontrolliertes Herunterskalieren.

> [!todo]
> (10) Warum sollten Sie ICC-Profil beim Scannen verwenden und in den Scan einbetten?

Ein **ICC-Profil** beschreibt, wie die Farbwerte des Scanners in einen geräteunabhängigen Farbraum übersetzt werden. Ohne eingebettetes Profil ist unklar, wie die gespeicherten Werte zu interpretieren sind – Farben können auf anderen Geräten/Druckstufen falsch dargestellt werden. Das Einbetten sichert eine konsistente, nachvollziehbare Farbwiedergabe entlang der gesamten Prozesskette.

### 1.3 Fortgeschritten

> [!todo]
> (11) Warum ist hohe Bit-Tiefe relevant?

Höhere Bit-Tiefe (z.B. 16 statt 8 Bit/Kanal) speichert mehr Abstufungen pro Farbkanal. Das reduziert **Tonwertabrisse (Banding)** bei nachträglichen Korrekturen (Gradation, Farbkonvertierung) erheblich, da Rechenungenauigkeiten mehr "Puffer" an Zwischenwerten haben.

> [!todo]
> (12) Unterschied Flachbett vs. Trommelscanner?

- **Flachbettscanner:** Vorlage liegt flach auf einer Glasplatte, Sensorzeile fährt darunter entlang – günstig, für die meisten Anwendungen ausreichend.
- **Trommelscanner:** Vorlage wird auf eine rotierende Trommel gespannt und punktweise mit einem Photomultiplier abgetastet – deutlich höhere optische Auflösung, $D_{max}$ und Farbtiefe, Standard für hochwertige professionelle Reproduktionen (z.B. Kunstdrucke).

> [!todo]
> (13) Welche Fehler entstehen bei zu niedriger Auflösung?

Sichtbare **Pixelbildung/Verpixelung**, Treppenstufen an Kanten, Verlust von Detailzeichnung und beim späteren Druck ein unscharfer, "weicher" Bildeindruck, da die Rasterpunkte des Drucks nicht mehr ausreichend fein durch Bildinformation gestützt werden.

> [!todo]
> (14) Warum ist ein CMYK-Scan problematisch?

Ein direkter CMYK-Scan legt die Farbwandlung (Scanner-spezifisch, meist qualitativ minderwertig) und den Zielfarbraum bereits beim Scan fest. Damit gehen Farbinformationen verloren, die außerhalb des gewählten CMYK-Raums lagen, und spätere Korrekturen sowie eine flexible Anpassung an unterschiedliche Druckverfahren sind kaum mehr möglich.

> [!todo]
> (15) Wie beeinflusst die Auflösung die Rasterung?

Die Bildauflösung muss ausreichend hoch relativ zur Rasterweite des Druckverfahrens sein (Faustregel: Scan-ppi ≈ 1,5–2× Rasterweite in L/cm, umgerechnet in ppi), damit beim Rasterprozess (Umwandlung in Halbtonpunkte) genügend echte Bildinformation pro Rasterzelle vorhanden ist. Ist die Auflösung zu gering, wirkt der Druck grob oder matschig; ist sie unnötig hoch, wächst nur die Dateigröße ohne sichtbaren Qualitätsgewinn.

## 2. Retusche

> [!info] Theoretische Grundlagen zu diesem Abschnitt: [[4. Preprint#4.2 Retusche|Retusche]]

### 2.1 Basis

> [!todo]
> (16) Was ist destruktive Retusche?

Bei der **destruktiven Retusche** werden die ursprünglichen Bildpixel dauerhaft überschrieben (z.B. direktes Malen/Stempeln auf der Bildebene). Der Originalzustand ist danach nicht mehr ohne Weiteres wiederherstellbar.

> [!todo]
> (17) Ziel der Hautretusche?

Ziel ist die Verbesserung des Hautbildes (Unreinheiten, Falten, Glanzstellen) bei gleichzeitigem **Erhalt der natürlichen Hautstruktur** (Poren, Textur), damit das Ergebnis nicht künstlich "plastikartig" wirkt.

> [!todo]
> (18) Was ist das Stempelwerkzeug?

Das **Stempelwerkzeug** (Clone Stamp) kopiert Bildinformation von einem gewählten Quellpunkt und überträgt sie deckend auf eine andere Bildstelle – klassisches Werkzeug der Kopierretusche (siehe [[4. Preprint#4.2.4 Technische Verfahren der Bildretusche]]).

> [!todo]
> (19) Was ist die Frequenztrennung?

Die **Frequenztrennung** trennt ein Bild in eine niedrigfrequente Ebene (Farbe, große Flächen, Tonwertverläufe) und eine hochfrequente Ebene (feine Textur/Struktur, Details). So lassen sich z.B. Hautunreinheiten in der niedrigfrequenten Ebene glätten, ohne die Hautstruktur der hochfrequenten Ebene zu zerstören.

> [!todo]
> (20) Warum ist das JPEG-Format problematisch?

JPEG verwendet eine **verlustbehaftete Kompression**. Bei wiederholtem Öffnen, Bearbeiten und Speichern akkumulieren sich Kompressionsartefakte (Blockbildung, Unschärfe), was besonders bei mehrstufiger Retusche zu sichtbarem Qualitätsverlust führt. Für Zwischenschritte sind daher verlustfreie Formate vorzuziehen.

### 2.2 Mittel

> [!todo]
> (21) Mit welchen Hauptkomponenten arbeitet non-destruktive Retusche?

**Ebenen** (Layers), **Einstellungsebenen** (Adjustment Layers), **Ebenenmasken** und **Smart-Objekte**. Die Bearbeitung erfolgt auf separaten Ebenen oberhalb des Originals, sodass das ursprüngliche Bildmaterial unverändert erhalten bleibt und Schritte jederzeit reversibel sind.

> [!todo]
> (22) Was ist Content-Aware-Fill?

Eine algorithmische Funktion, die einen markierten Bildbereich automatisch anhand der umgebenden Bildinformation (Muster, Struktur, Farbe) füllt bzw. rekonstruiert – nützlich zum Entfernen von Objekten ohne manuelles Stempeln.

> [!todo]
> (23) Warum ist ein Histogramm wichtig?

Das **Histogramm** zeigt die Verteilung der Tonwerte (von Schwarz bis Weiß) im Bild. Es macht sichtbar, ob Zeichnung in Lichtern/Tiefen verloren geht (abgeschnittene Ränder), wie der Kontrastumfang genutzt wird, und dient als objektive Grundlage für Gradations- und Tonwertkorrekturen.

> [!todo]
> (24) Wie entfernt man Rauschen?

Über **Weichzeichnungs-/Entrauschungsfilter** (z.B. Median-, Gauß-basierte Rauschreduktion), idealerweise kanalselektiv (Luminanz- vs. Farbrauschen getrennt behandeln) oder mittels Frequenztrennung, um Detailverlust zu minimieren.

> [!todo]
> (25) Was ist der Unterschied zwischen Produkt und Portrait?

Bei der **Produktretusche** steht die möglichst exakte, fehlerfreie und oft "perfektionierte" Darstellung eines Gegenstands (Form, Oberfläche, Farbtreue) im Vordergrund. Bei der **Portraitretusche** steht der natürliche, aber geschönte Ausdruck einer Person im Vordergrund – hier ist der Erhalt von Authentizität (Hautstruktur, Mimik) besonders kritisch zu wahren.

### 2.3 Fortgeschritten

> [!todo]
> (26) Was sind Risiken starker Retusche?

Unnatürlich wirkende, "überglättete" Ergebnisse, Verlust von Authentizität und Wiedererkennbarkeit, ethische/rechtliche Probleme bei Bildmanipulation (siehe [[4. Preprint#4.2.2 Beispiel 1: Sowjetische Propaganda|Fotomanipulation]]) sowie technische Artefakte (Halo-Effekte, Texturverlust, sichtbare Retuschekanten).

> [!todo]
> (27) Warum ist CMYK kritisch bei Retusche?

Der CMYK-Farbraum ist deutlich kleiner als RGB. Retuschearbeiten (insbesondere Farbkorrekturen) in CMYK können zu Farbclipping und gröberen Abstufungen führen. Zudem verändert sich beim Umrechnen jeder CMYK→RGB→CMYK-Zyklus die Farbwerte, weshalb Retusche i.d.R. in RGB und erst final in CMYK konvertiert werden sollte.

> [!todo]
> (28) Wie bleibt die Hautstruktur erhalten?

Durch **Frequenztrennung** (Glättung nur auf der niedrigfrequenten, texturfreien Ebene) statt globaler Weichzeichnung, sowie durch Arbeiten mit geringer Deckkraft/Fluss und selektiven Masken statt flächendeckender Bearbeitung.

> [!todo]
> (29) Wann ist das Stempelwerkzeug ungeeignet?

Bei großflächigen, strukturierten oder perspektivisch/beleuchtungstechnisch komplexen Bereichen, wo eine einfache 1:1-Kopie der Quellregion zu sichtbaren Wiederholungsmustern oder Passungenauigkeiten (Licht, Schatten, Perspektive) führen würde – hier sind Content-Aware-Werkzeuge oder manuelle Bildsynthese geeigneter.

> [!todo]
> (30) Was passiert bei übermäßiger Glättung?

Verlust von feiner Textur und Detailzeichnung, ein "wächserner"/künstlicher Bildeindruck, sowie im Druck ein Verlust an wahrgenommener Schärfe, da feine Hochfrequenzanteile fehlen, die das Auge als Detailschärfe interpretiert.

## 3. Satzherstellung

> [!info] Theoretische Grundlagen zu diesem Abschnitt: [[4. Preprint#4.3 Satzherstellung|Satzherstellung]]

### 3.1 Basis

> [!todo]
> (31) Was ist Flattersatz?

Textsatz, bei dem nur eine Seite des Textblocks (meist links) bündig ist, während die andere Seite (rechts) unterschiedlich lange Zeilen mit natürlichem, ungleichmäßigem Zeilenende aufweist – ohne erzwungene Wortzwischenraum-Streckung.

> [!todo]
> (32) Was ist Blocksatz?

Textsatz, bei dem sowohl der linke als auch der rechte Rand bündig ausgerichtet sind. Dazu werden die Wortzwischenräume (und ggf. Buchstabenabstände) pro Zeile individuell gestreckt oder gestaucht.

> [!todo]
> (33) Was ist Zeilenabstand?

Der vertikale Abstand zwischen den Grundlinien zweier aufeinanderfolgender Textzeilen (auch Durchschuss oder Zeilendurchschuss genannt), meist relativ zur Schriftgröße angegeben.

> [!todo]
> (34) Was sind Versalziffern?

Ziffern in einheitlicher Höhe, die auf der Grundlinie stehen und die Höhe der Versalien (Großbuchstaben) erreichen – im Gegensatz zu Mediävalziffern, die unterschiedliche Höhen haben und teils unter die Grundlinie ragen.

> [!todo]
> (35) Was ist OpenType?

Ein plattformübergreifendes, von Adobe und Microsoft entwickeltes Schriftartenformat, das umfangreiche typografische Funktionen (Ligaturen, alternative Zeichensätze, Versal-/Mediävalziffern, Sonderzeichen) in einer einzigen Schriftdatei bündeln kann.

### 3.2 Mittel

> [!todo]
> (36) Was ist die Laufweite?

Die **Laufweite** ist der generelle, gleichmäßig auf alle Zeichen einer Textpassage angewendete Zusatzabstand zwischen den Buchstaben (im Unterschied zur paarweisen Unterschneidung/Kerning einzelner Zeichenpaare).

> [!todo]
> (37) Was sind Hurenkinder bzw. Zeilenwaise?

Als **Hurenkind** (auch Waisenkind je nach Definition) bezeichnet man die letzte Zeile eines Absatzes, wenn sie allein an den Anfang der nächsten Spalte/Seite fällt und dort isoliert steht – typografisch unerwünscht.

> [!todo]
> (38) Was sind Schusterjungen bzw. Zeilenwaise?

Der **Schusterjunge** ist die erste Zeile eines Absatzes, wenn sie allein am Ende einer Spalte/Seite steht, während der restliche Absatz erst auf der Folgeseite/-spalte fortgesetzt wird – ebenfalls typografisch zu vermeiden.

> [!todo]
> (39) Was ist das Grundlinienraster?

Ein unsichtbares, regelmäßiges horizontales Raster, an dem die Grundlinien aller Textzeilen (auch über mehrere Spalten hinweg) ausgerichtet werden, damit Zeilen auf gegenüberliegenden Seiten/Spalten exakt miteinander fluchten.

> [!todo]
> (40) Warum ist Silbentrennung wichtig?

Silbentrennung verhindert zu große Wortzwischenräume im Blocksatz bzw. zu unruhige Zeilenlängen im Flattersatz, indem lange Wörter am Zeilenende sinnvoll getrennt werden können – das verbessert den Lesefluss und das gleichmäßige Satzbild.

> [!todo]
> (41) Unterschied Mediäval vs Versalziffern?

- **Mediävalziffern:** unterschiedliche Höhen und Über-/Unterlängen, fügen sich harmonisch in Fließtext mit Ober-/Unterlängen ein.
- **Versalziffern:** einheitliche Höhe auf Großbuchstaben-Niveau, wirken in Kombination mit Versalien/Tabellen ruhiger und geordneter.

### 3.3 Fortgeschritten

> [!todo]
> (42) Warum ist Mikrotypografie wichtig?

Mikrotypografie (feine Details wie Unterschneidung, Laufweite, korrekte Anführungszeichen/Gedankenstriche, optischer Randausgleich) beeinflusst maßgeblich die Lesbarkeit und die professionelle Wirkung eines Satzes, auch wenn die einzelnen Korrekturen für sich genommen kaum bewusst wahrgenommen werden.

> [!todo]
> (43) Was sind typische Satzfehler?

Hurenkinder/Schusterjungen, unregelmäßige Wortzwischenräume im Blocksatz ("Rivers"), fehlende oder falsche Silbentrennung, falsche An- und Abführungszeichen, doppelte Leerzeichen, sowie inkonsistente Laufweiten/Zeilenabstände.

> [!todo]
> (44) Einfluss der Schriftwahl?

Die Schriftwahl beeinflusst Lesbarkeit, Textlänge (Laufweite pro Zeichen), Anmutung/Corporate-Wirkung und Eignung für das Ausgabemedium (z.B. Serifenschriften für langen Fließtext im Druck, serifenlose Schriften oft für Bildschirm/Überschriften).

> [!todo]
> (45) Was unterscheidet Print von Websatz und warum ist der Unterschneidung wichtig?

Print-Satz erfolgt für ein fixes, hochauflösendes Ausgabemedium mit exakter WYSIWYG-Kontrolle über jedes Zeichen, während Websatz responsiv auf unterschiedliche Bildschirmgrößen/-auflösungen reagieren muss und typografische Details oft eingeschränkter kontrollierbar sind. Die **Unterschneidung (Kerning)** ist wichtig, weil bestimmte Zeichenpaare (z.B. "AV", "To") ohne Anpassung optisch zu große oder zu kleine Abstände aufweisen würden, was das Satzbild unruhig und unprofessionell wirken lässt.

## 4. Layouten

> [!info] Theoretische Grundlagen zu diesem Abschnitt: [[4. Preprint#4.4 Layouten|Layouten]]

### 4.1 Basis

> [!todo]
> (46) Was ist das Gestaltungsraster?

Ein unsichtbares Ordnungssystem aus Spalten, Zeilen und Randabständen, das die Platzierung von Text- und Bildelementen auf einer Seite steuert und für ein konsistentes, wiedererkennbares Erscheinungsbild über mehrere Seiten sorgt.

> [!todo]
> (47) Was ist Weißraum?

Bewusst freigelassene, nicht mit Inhalt belegte Fläche im Layout. Weißraum strukturiert die Seite, schafft Ruhepausen für das Auge und lenkt die Aufmerksamkeit auf die verbleibenden Elemente.

> [!todo]
> (48) Was ist visuelle Hierarchie?

Die gezielte Anordnung und Gestaltung (Größe, Farbe, Position, Kontrast) von Elementen, sodass der Betrachter automatisch in einer beabsichtigten Reihenfolge (z.B. Blickfang → Überschrift → Fließtext) durch die Seite geführt wird.

> [!todo]
> (49) Was ist Editorial Design?

Die redaktionelle Gestaltung von Print- oder Digitalpublikationen (Zeitschriften, Bücher, Magazine), die Layout, Typografie und Bildsprache so kombiniert, dass Inhalt und journalistische Aussage optimal unterstützt werden.

> [!todo]
> (50) Warum ist die Farbpsychologie wichtig?

Farben lösen beim Betrachter unbewusste emotionale Assoziationen und Erwartungen aus (z.B. Rot = Dringlichkeit/Wärme, Blau = Vertrauen/Ruhe). Eine bewusste Farbwahl im Layout unterstützt die gewünschte Markenwirkung und Botschaft.

### 4.2 Mittel

> [!todo]
> (51) Was ist der Unterschied zwischen Raster und freiem Layout?

Ein **Rasterlayout** ordnet Elemente streng nach einem vordefinierten Spalten-/Zeilenraster – konsistent, gut lesbar, effizient für serielle Publikationen. Ein **freies Layout** verzichtet auf ein starres Gerüst und platziert Elemente gestalterisch frei, was mehr kreativen Ausdruck erlaubt, aber Konsistenz und Wiederverwendbarkeit erschwert.

> [!todo]
> (52) Was ist der goldene Schnitt?

Ein harmonisches Teilungsverhältnis (ca. 1:1,618), bei dem sich der kleinere Teil zum größeren verhält wie der größere zum Ganzen. Er wird in der Gestaltung genutzt, um als ästhetisch besonders ausgewogen empfundene Proportionen und Bildaufteilungen zu erzeugen.

> [!todo]
> (53) Was ist die Blickführung?

Die gezielte Steuerung, in welcher Reihenfolge und entlang welcher Pfade das Auge des Betrachters über eine Seite oder ein Bild wandert, gesteuert durch Kontraste, Linien, Größenverhältnisse und Platzierung der visuellen Hierarchie.

> [!todo]
> (54) Was ist Corporate Design?

Die einheitliche visuelle Gestaltung aller Kommunikationsmittel eines Unternehmens (Logo, Farben, Typografie, Bildsprache), die als sichtbarer Teil der Corporate Identity zur Wiedererkennung und Konsistenz der Markenwirkung beiträgt.

> [!todo]
> (55) Warum ist Bild-Text-Hierarchie wichtig?

Sie legt fest, ob Bild oder Text die primäre Aussage transportiert und in welcher Reihenfolge der Betrachter beides wahrnimmt. Eine klare Hierarchie verhindert visuelle Konkurrenz zwischen Bild und Text und unterstützt eine eindeutige Kommunikation der Kernbotschaft.

### 4.3 Fortgeschritten

> [!todo]
> (56) Was ist Layoutanpassung für Formate?

Die Anpassung eines bestehenden Layouts (Proportionen, Elementgrößen, Bild-/Textanordnung) an unterschiedliche Ausgabeformate (z.B. Hochformat/Querformat, Print/Web, unterschiedliche Papierformate), ohne die gestalterische Grundidee und Lesbarkeit zu verlieren.

> [!todo]
> (57) Was sind typische Layoutfehler?

Fehlendes oder inkonsistentes Raster, überladene Seiten ohne Weißraum, unklare visuelle Hierarchie, schlechte Bild-Text-Abstimmung, sowie Verstöße gegen Format-/Beschnittvorgaben (Inhalt zu nah am Anschnitt).

> [!todo]
> (58) Welche Rolle spielen Vektorgrafiken beim Layouten?

Vektorgrafiken (Logos, Icons, Diagramme) sind auflösungsunabhängig frei skalierbar, ohne an Qualität zu verlieren. Das erlaubt flexible Formatanpassungen im Layout, ohne Pixelverlust oder erneutes Retuschieren wie bei Rastergrafiken.

> [!todo]
> (59) Wie wirkt Weißraum?

Weißraum erhöht die wahrgenommene Wertigkeit und Übersichtlichkeit eines Layouts, verbessert die Lesbarkeit, schafft Fokus auf einzelne Elemente und vermittelt je nach Menge eine ruhige (viel Weißraum) oder dynamische/dichte (wenig Weißraum) Anmutung.

> [!todo]
> (60) Warum ist die Einhaltung des Rasters wichtig?

Sie sichert visuelle Konsistenz über mehrere Seiten/Ausgaben hinweg, erleichtert die Wiederverwendung von Layoutvorlagen, unterstützt eine klare Bild-Text-Hierarchie und beschleunigt die redaktionelle Produktion, da Positionen nicht jedes Mal neu definiert werden müssen.

## 5. Ausschießen

> [!info] Theoretische Grundlagen zu diesem Abschnitt: [[4. Preprint#4.5 Ausschießen|Ausschießen]]

### 5.1 Basis

> [!todo]
> (61) Was ist das Ausschießen?

Das **Ausschießen** ist die Anordnung mehrerer Einzelseiten auf einem größeren Druckbogen, sodass nach dem Drucken, Falzen und Schneiden die Seiten in der korrekten Reihenfolge und Ausrichtung gebunden werden können (siehe [[4. Preprint#4.5 Ausschießen|Ausschießen]]).

> [!todo]
> (62) Was ist ein Falzbogen?

Ein bedruckter Druckbogen, der nach dem Druck durch Falzen in die endgültige Seitenreihenfolge und -größe gebracht wird; er enthält mehrere Nutzen (Einzelseiten), die durch das Ausschießschema korrekt platziert wurden.

> [!todo]
> (63) Was ist der Bund?

Die Kante eines Druckbogens/Buches, an der die einzelnen Lagen/Seiten miteinander verbunden (geheftet, geklebt, genäht) werden – die "Innenkante" eines aufgeschlagenen Buches.

> [!todo]
> (64) Was ist der Beschnitt?

Der Rand um den eigentlichen Inhaltsbereich, der bewusst über das spätere Endformat hinausgedruckt und nach dem Druck weggeschnitten wird, um randlosen Druck ohne weiße Blitzer am Seitenrand zu ermöglichen.

> [!todo]
> (65) Warum ist die Laufrichtung wichtig?

Die Papierlaufrichtung (Faserrichtung) beeinflusst die Stabilität, das Falzverhalten und die Planlage des fertigen Produkts. Falsche Laufrichtung führt zu Wellenbildung, schlechteren Falzkanten (Rupfen der Fasern) und Passungenauigkeiten bei mehrseitigen Produkten.

### 5.2 Mittel

> [!todo]
> (66) Was ist ein "16-Seiter"?

Ein Druckbogen, auf dem durch mehrfaches Falzen 16 Buchseiten (auf jeweils einer Falzlage, meist 4-fach gefalzt) untergebracht werden – eine gängige Standard-Bogengröße in der Buch-/Broschürenproduktion (siehe Tabelle mit Druckbogenfolgen).

> [!todo]
> (67) Worin besteht der Unterschied zwischen Kreuz- und Parallelfalz?

- **Parallelfalz:** alle Falze verlaufen parallel zueinander (z.B. Wickel- oder Zickzackfalz).
- **Kreuzfalz:** jeder weitere Falz steht im rechten Winkel zum vorherigen Falz – Standardverfahren für die meisten Buch-/Zeitschriftenbogen, da es kompaktere und stabilere Lagen erzeugt.

> [!todo]
> (68) Was ist Bundzuwachs?

Der bei mehrlagigen, ineinander gesteckten Falzbogen (z.B. Rückstichbindung) auftretende Effekt, dass innenliegende Lagen am Bund weiter herausragen als außenliegende, da sie um die Dicke der umgebenden Lagen "wachsen" – muss beim Beschnitt/Layout innenliegender Seiten kompensiert werden.

> [!todo]
> (69) Warum ist Nummerierung wichtig?

Die Bogen-/Seitennummerierung (inkl. Kollationiermarken) stellt sicher, dass Falzbogen nach dem Druck in der richtigen Reihenfolge zusammengetragen und gebunden werden – Fehler hier führen zu vertauschten oder fehlenden Seiten im fertigen Produkt.

> [!todo]
> (70) Was ist der Industriestandard unter den Softwares für das Ausschießen?

**Kodak Preps** (bzw. dessen Nachfolger) gilt als weit verbreiteter Industriestandard für professionelle Ausschieß-Software in Druckereien.

### 5.3 Fortgeschritten

> [!todo]
> (71) Welcher Hauptfehler entsteht bei falschem Ausschießen?

Seiten geraten nach dem Schneiden/Binden in falscher Reihenfolge, kopfstehend oder seitenverkehrt in das fertige Produkt – das gesamte Druckerzeugnis wird dadurch unbrauchbar (Makulatur).

> [!todo]
> (72) Was ist eine Sammelform?

Eine Ausschießvariante, bei der mehrere unterschiedliche Druckbogen (bzw. Lagen desselben Produkts) auf einer gemeinsamen Druckform zusammengefasst werden, um den Bogen effizienter auszunutzen bzw. den Druckdurchlauf zu reduzieren.

> [!todo]
> (73) Warum ist der Proof wichtig?

Der **Proof** (Andruck/Digitalproof) zeigt vor dem eigentlichen Produktionsdruck verbindlich, wie Farben, Layout und Ausschießen im Ergebnis aussehen werden. Er dient als Freigabegrundlage ("Gut zum Druck") zwischen Kunde/Agentur und Druckerei und verhindert teure Fehldrucke.

> [!todo]
> (74) Was ist der Einfluss der Bindung?

Die gewählte Bindeart (Rückstichbindung, Klebebindung, Fadenheftung) bestimmt Bundzuwachs, maximale Seitenzahl, Aufschlagverhalten des Buchs und damit auch, wie das Ausschießschema und der Innen-/Außenbeschnitt am Bund gestaltet werden müssen.

> [!todo]
> (75) Warum ist die Papierlaufrichtung kritisch?

Sie beeinflusst maßgeblich die Planlage, das Falzverhalten (glatte vs. rissige Falzkante) und die mechanische Stabilität gebundener Produkte – falsche Laufrichtung im Verhältnis zum Falz bzw. zur Bindekante kann zu Verzug und schlechter Haltbarkeit führen.

## 6. Druckvorlage

> [!info] Theoretische Grundlagen zu diesem Abschnitt: [[4. Preprint#4.6 Druckvorlage|Druckvorlage]]

### 6.1 Basis

> [!todo]
> (76) Was ist PDF/X?

Ein genormtes Subset des PDF-Formats speziell für den professionellen Druckdatenaustausch. PDF/X schreibt bestimmte Anforderungen vor (z.B. eingebettete Schriften, definierte Farbräume, keine unzulässigen Transparenzen), um eine verlässliche, geräteunabhängige Druckvorlage sicherzustellen.

> [!todo]
> (77) Wo werden RGB und CMYK verwendet?

- **RGB:** additive Farbmischung für selbstleuchtende Ausgabegeräte (Bildschirme, Scanner, Kameras).
- **CMYK:** subtraktive Farbmischung für den Druck auf reflektierende Medien (Papier), da hier Licht durch aufgetragene Farbe absorbiert statt emittiert wird.

> [!todo]
> (78) Warum sollten Schriften eingebettet werden?

Ohne eingebettete Schriften greift die Druckerei bzw. der RIP auf lokal installierte (ggf. andere oder fehlende) Schriften zurück, was zu falscher Darstellung, verschobenem Umbruch oder Ersatzzeichen führen kann. Eingebettete Schriften garantieren eine identische Darstellung auf jedem System.

> [!todo]
> (79) Was ist der Anschnitt?

Der über das Endformat hinausragende Bereich eines Layouts (typischerweise 3 mm), der beim Beschnitt entfernt wird – notwendig, damit randabfallende Elemente (Bilder, Flächen) nach dem Schnitt tatsächlich bis zum Rand reichen, auch bei kleinen Schnittungenauigkeiten.

> [!todo]
> (80) Was ist das Preflight?

Eine automatisierte Prüfung der Druckdatei vor der Produktion auf technische Fehler (fehlende Schriften, falscher Farbraum, zu niedrige Bildauflösung, fehlender Beschnitt, problematische Transparenzen), um Druckfehler frühzeitig zu erkennen und zu korrigieren.

### 6.2 Mittel

> [!todo]
> (81) Worin unterscheiden sich die Einsätze von PDF/X-1a und PDF/X-4?

- **PDF/X-1a:** älterer, restriktiverer Standard – nur CMYK/Sonderfarben, keine Transparenzen oder ICC-basierte RGB-Daten erlaubt (alles muss vorab plattgedrückt/konvertiert sein).
- **PDF/X-4:** moderner Standard, der native Transparenzen und ICC-basiertes Farbmanagement (auch RGB-Daten mit Farbprofil) unterstützt, wodurch mehr Flexibilität und geringerer Datenverlust möglich sind.

> [!todo]
> (82) Warum werden ICC-Profile verwendet?

ICC-Profile beschreiben das exakte Farbverhalten eines Geräts/Prozesses (Scanner, Monitor, Drucker) in einem geräteunabhängigen Referenzraum, sodass Farben über die gesamte Prozesskette hinweg konsistent und vorhersagbar umgerechnet werden können.

> [!todo]
> (83) Was sind Sonderfarben?

Vorgemischte Druckfarben (z.B. Pantone/HKS), die als zusätzlicher, exakt definierter Farbkanal gedruckt werden, statt aus den vier Prozessfarben CMYK gerastert zu werden – genutzt für Farben außerhalb des CMYK-Gamuts oder für Corporate-Farbtreue.

> [!todo]
> (84) Was ist Überdrucken?

Eine Druckeinstellung, bei der eine Farbfläche direkt auf eine darunterliegende, bereits gedruckte Farbe gedruckt wird, statt die darunterliegende Fläche automatisch auszusparen (Freistellung) – wird gezielt eingesetzt, um Registerungenauigkeiten (weiße Blitzer) zu vermeiden, z.B. bei schwarzem Text auf Farbflächen.

> [!todo]
> (85) Warum ist Transparenz problematisch?

Native Transparenzen (z.B. Schlagschatten, Ebenendeckkraft) müssen für viele Ausgabeprozesse in flache, undurchsichtige Objekte "aufgelöst" werden (Flattening). Dabei können unerwartete Farbverschiebungen, sichtbare Schnittkanten zwischen aufgelösten Objekten oder Rasterisierungsartefakte entstehen, wenn der Prozess nicht korrekt gesteuert wird.

### 6.3 Fortgeschritten

> [!todo]
> (86) Was sind typische PDF-Fehler?

Fehlende oder nicht eingebettete Schriften, falscher Farbraum (RGB statt CMYK ohne Profil), zu niedrige Bildauflösung, fehlender oder falsch dimensionierter Anschnitt, ungewollte Transparenzen/Überdruckeneinstellungen sowie falsche Seitenreihenfolge/-größe.

> [!todo]
> (87) Wie kann man Druckdaten optimieren?

Durch Preflight-Prüfung, korrekte Farbraumkonvertierung mit passenden ICC-Profilen, Einbetten aller Schriften, Komprimierung von Bildern auf sinnvolle (nicht übermäßige) Auflösung, sowie das gezielte Flatten problematischer Transparenzen vor der Ausgabe.

> [!todo]
> (88) Warum ist eine Farbkonvertierung kritisch?

Beim Wechsel zwischen Farbräumen (z.B. RGB → CMYK) können Farben außerhalb des Zielgamuts nicht exakt reproduziert werden und werden approximiert (Gamut-Mapping) – dies kann zu sichtbaren Farbabweichungen gegenüber dem Bildschirm-/Ausgangsbild führen, wenn nicht kontrolliert und mit passendem Rendering Intent durchgeführt.

> [!todo]
> (89) Wozu dient die Druckvorstufenprüfung?

Sie stellt sicher, dass die finale Druckvorlage technisch korrekt, vollständig und den Vorgaben (Format, Farbraum, Auflösung, Beschnitt) entsprechend ist, bevor kostenintensive Druckplatten belichtet und die eigentliche Produktion gestartet wird.

> [!todo]
> (90) Was ist der K-Kanal bei CMYK und welchen Einfluss hat er bei "fettem Schwarz"?

Der **K-Kanal (Key/Schwarz)** liefert Kontrast und Tiefe im Schattenbereich und ermöglicht reines Schwarz, da eine reine CMY-Mischung praktisch nie ein sauberes, tiefes Schwarz ergibt. **Fettes Schwarz** wird erzeugt, indem zusätzlich zu 100 % K weitere Prozessfarben (z.B. C 40/M 30/Y 30/K 100) beigemischt werden, um ein satteres, deckenderes Schwarz zu erhalten (siehe [[4. Preprint#4.6.2 Druckkontrollstreifen|Druckkontrollstreifen]]).

## 7. Druckform

> [!info] Theoretische Grundlagen zu diesem Abschnitt: [[4. Preprint#4.7 Druckformerstellung|Druckformerstellung]]

### 7.1 Basis

> [!todo]
> (91) Was ist eine Druckform?

Der physische Träger (z.B. Druckplatte, Zylinder), von dem die Druckfarbe direkt oder indirekt auf den Bedruckstoff übertragen wird – sie enthält die druckenden und nicht-druckenden Bereiche eines Farbauszugs.

> [!todo]
> (92) Was ist CTP?

**CTP (Computer to Plate):** direktes, digitales Belichten der Druckplatte aus den digitalen Druckdaten heraus, ohne den Zwischenschritt eines analogen Films (siehe [[4. Preprint#4.7.2 CTP – Computer to Plate|CTP]]).

> [!todo]
> (93) Was ist Offsetdruck?

Ein indirektes Flachdruckverfahren, bei dem die Druckfarbe zunächst von der Druckplatte auf ein Gummituch ("Offset") und erst von dort auf den Bedruckstoff übertragen wird. Basiert auf dem physikalischen Prinzip, dass sich Fett (Farbe) und Wasser abstoßen.

> [!todo]
> (94) Was ist Rasterung?

Die Umwandlung kontinuierlicher Tonwerte (Halbtöne) eines Bildes in ein Muster kleiner, unterschiedlich großer Druckpunkte, da die meisten Druckverfahren nur "an/aus" (volle Farbe oder keine Farbe) drucken können – der Halbtoneindruck entsteht optisch durch die Punktgröße/-dichte.

> [!todo]
> (95) Was ist eine Druckplatte?

Die im Offsetdruck (bzw. Flexo-/Hochdruck) verwendete Druckform, meist aus beschichtetem Aluminium (Offset) oder Fotopolymer (Flexo), auf der die druckenden Bildbereiche durch Belichtung (CTP) chemisch/physikalisch von den nicht-druckenden Bereichen unterschieden werden.

### 7.2 Mittel

> [!todo]
> (96) Worin unterscheiden sich Positiv- und Negativplatte?

- **Positivplatte:** die belichteten Bereiche werden beim Entwickeln entfernt/löslich – das, was auf der Vorlage schwarz (druckend) ist, bleibt auf der Platte stehen.
- **Negativplatte:** umgekehrtes Prinzip – die unbelichteten Bereiche werden entfernt, die belichteten Bereiche bleiben (härten aus) und werden druckend.

> [!todo]
> (97) Wie funktioniert die Plattenbelichtung?

Ein Laser (UV, violett/sichtbares Licht, IR/thermisch oder elektrostatisch, je nach CTP-System) rastert die beschichtete Platte gemäß den digitalen Bilddaten Punkt für Punkt ab und verändert dabei gezielt die Löslichkeit/Härtung der Beschichtung an den entsprechenden Stellen (siehe [[4. Preprint#4.7.2 CTP – Computer to Plate|CTP]]).

> [!todo]
> (98) Was ist Farbseparation?

Die Aufteilung eines Farbbildes in seine einzelnen Druckfarbauszüge (i.d.R. C, M, Y, K sowie ggf. Sonderfarben), aus denen jeweils eine eigene Druckform erstellt wird – jede Druckform überträgt nur die Information ihres Farbkanals.

> [!todo]
> (99) Warum Tonwertzunahme?

Beim Druck vergrößern sich die Rasterpunkte gegenüber ihrer digitalen Vorgabe leicht (durch Farbverlauf, Druck, Papiersaugfähigkeit) – dieser als **Tonwertzunahme** bezeichnete Effekt muss bereits bei der Druckvorstufe kalkuliert und kompensiert werden, damit das gedruckte Ergebnis dem beabsichtigten Farbeindruck entspricht.

> [!todo]
> (100) Was ist Flexodruck?

Ein direktes Hochdruckverfahren mit flexiblen Fotopolymer- oder Gummidruckformen, bei dem die erhabenen (druckenden) Bereiche die Farbe direkt auf den Bedruckstoff übertragen – häufig für Verpackungen, Etiketten und auf saugfähigen/unebenen Materialien eingesetzt.

### 7.3 Fortgeschritten

> [!todo]
> (101) Was sind gängige Fehler bei der Belichtung?

Falsche Belichtungsdauer/-intensität (zu wenig/zu viel Belichtung führt zu zu dünnen oder zugelaufenen Rasterpunkten), Verunreinigungen der Plattenoberfläche, Fokus-/Justagefehler des Belichters sowie Entwicklungsfehler in der Nachbearbeitung der Platte.

> [!todo]
> (102) Warum ist die Qualitätskontrolle wichtig?

Sie stellt sicher, dass Farbtreue, Register und Tonwertwiedergabe über die gesamte Auflage konstant bleiben und erkennt Abweichungen frühzeitig, bevor größere Mengen fehlerhaft bedruckt und damit zu Makulatur werden.

> [!todo]
> (103) Was beeinflusst die Druckqualität?

Qualität und Belichtungsgenauigkeit der Druckform, Register-/Passergenauigkeit, Farbwerk-/Feuchtwerkeinstellung (bei Offset), Papiereigenschaften (Saugfähigkeit, Laufrichtung, Oberfläche) sowie die korrekte Tonwertkompensation in der Druckvorstufe.

> [!todo]
> (104) Worin unterscheiden sich digitale und konventionelle Druckform?

- **Konventionelle Druckform:** physisch feste Platte/Zylinder, die für die gesamte Auflage unverändert bleibt (z.B. Offset-, Flexo-, Tiefdruckform) – hohe Rüstkosten, aber sehr günstig bei großen Auflagen.
- **Digitale "Druckform":** entfällt im eigentlichen Sinne (z.B. beim Digitaldruck/Laserdruck wird das Bild pro Druckdurchgang neu über eine Bildtrommel erzeugt) – keine physische Plattenherstellung nötig, wirtschaftlich auch bei sehr kleinen Auflagen inkl. individualisiertem Druck.

> [!todo]
> (105) Warum ist das Raster wichtig?

Da die meisten Druckverfahren keine kontinuierlichen Halbtöne, sondern nur volle Farbdeckung erzeugen können, ist das Raster die technische Grundlage, um durch unterschiedlich große/dichte Druckpunkte den Eindruck von Halbtönen und Farbmischungen (durch Überlagerung mehrerer Rasterwinkel) zu erzeugen.

## 8. Aufgaben zur Prüfungsvorbereitung

### 8.1 Allgemeines

> [!todo]
> (106) Welche Aufgaben umfasst die Druckvorstufe? (5P)
> (a) Zählen Sie diese Aufgaben in geeigneter Reihenfolge auf!
> (b) Weshalb gibt es nicht "die eine richtige Reihenfolge"?

- (a) Erfassung von Bestandsmedien (Scan) → Retusche → Satzherstellung → Layouten → Ausschießen → Erstellung der Druckvorlage (PDF) → Druckformerstellung (siehe [[4. Preprint#4.1.1 Prozessschritte|Prozessschritte]]).
- (b) Es gibt keine zwingend einzige richtige Reihenfolge, da einzelne Schritte parallel oder iterativ ablaufen können (z.B. wird während des Layoutens oft noch retuschiert, oder die Satzherstellung läuft parallel zur Bildbearbeitung) – die konkrete Abfolge hängt vom jeweiligen Produkt, Workflow und Team ab.

> [!todo]
> (107) Am Ende des Scans steht ein unverändertes Digitaloriginal. (3P)
> (a) Was ist damit gemeint?
> (b) Welche Werkzeuge werden genutzt?

- (a) Das direkt aus dem Scanvorgang resultierende Bild wird unbearbeitet archiviert, bevor irgendeine Retusche stattfindet – es dient als originalgetreue, jederzeit wieder abrufbare Referenz- und Sicherungskopie.
- (b) Scanner (ggf. mit OCR), Kamera, Mikrofon (ggf. mit STT) – siehe [[4. Preprint#4.1.2 Erfassung von Bestandsmedien|Erfassung von Bestandsmedien]].

> [!todo]
> (108) Ein Beispiel für Retusche ist das Photoshoppen. Was ist damit gemeint und welche Standardarbeiten sind damit gemeint? (3P)

"Photoshoppen" bezeichnet umgangssprachlich die digitale Bildretusche (typischerweise mit Adobe Photoshop). Standardarbeiten sind u.a.: Kopierretusche (Bildelemente kopieren/übertragen), Pinselretusche (Übermalen mit variabler Deckkraft) und Textretusche (Korrektur von Satzfehlern im Digitaloriginal) – siehe [[4. Preprint#4.2.4 Technische Verfahren der Bildretusche|Technische Verfahren der Bildretusche]].

> [!todo]
> (109) Welches Ziel verfolgt das Layouten? Beschreiben Sie die Teilaufgaben! (3P)

Ziel ist die visuelle Finalisierung der Druckvorlage. Teilaufgaben: Festlegung von Farbklima/Farbspektrum, Definition von Druck- und Inhaltsbereich (Formate), Zuweisung von Weißraum (Platzierung/Abstände/Größen von Bildern, Satzspiegel) sowie die Finalisierung der Umbrüche (siehe [[4. Preprint#4.4.1 Elemente des Layoutens|Elemente des Layoutens]]).

> [!todo]
> (110) Welche Tätigkeiten umfasst das Layouten? (5P)

Farbklima/Farbspektrum festlegen, Druck- und Inhaltsbereich definieren, Schriftgrößen/-arten (Typografie) festlegen, Weißraum zuweisen (Bildplatzierung, Satzspiegel), sowie Umbrüche finalisieren – siehe [[4. Preprint#4.4.1 Elemente des Layoutens|Elemente des Layoutens]].

> [!todo]
> (111) Was wird bei der Formatfestlegung festgelegt für (2P)
> (a) Druckbereich und
> (b) Inhaltsbereich?

- (a) **Druckbereich:** Inhalt + Drucküberstand (Anschnitt) + Schnittkante.
- (b) **Inhaltsbereich:** Inhalt + Falz (Bereich, der für Bundzuwachs/Falzung berücksichtigt werden muss).

> [!todo]
> (112) Was bezeichnet das Ausschießen? (5P)
> Zählen Sie die wichtigsten Ziele auf!
> (a)
> (b) Was ist dabei der Schöndruck und Widerdruck?
> (c) Was ist in diesem Kontext das Register?

- Ausschießen bezeichnet die Anordnung der Druckseiten auf dem Druckbogen zur Vorbereitung der Buchbindung (siehe [[4. Preprint#4.5 Ausschießen|Ausschießen]]).
- (a) Wichtigste Ziele: korrekter Stand (Textrichtung), korrekte Seitenfolge, korrektes Register.
- (b) **Schöndruck** (recto) = Bedruckung der Vorderseite; **Widerdruck** (verso) = Bedruckung der Rückseite eines Bogens.
- (c) Das **Register** ist die exakte Überlagerung/Passung gleicher Layout-Elemente (z.B. Vorder- und Rückseite oder mehrerer Farbauszüge) zueinander.

> [!todo]
> (113) Was sind Flatter- und Passermarken? (2P)

**Flattermarken:** dienen der einfachen Erkennung korrekter Druckbogensortierung durch definierten Versatz zwischen den Bogen. **Passermarken:** dienen der Erkennung korrekter Mehrfarbdruckdeckung (Register) mit definierter Toleranz je Farbe – siehe [[4. Preprint#4.6.1 Flattermarken und Passermarken|Flattermarken und Passermarken]].

### 8.2 Ausgabeergebnis

> [!todo]
> (116) Am Bildschirm und am Druckerzeuger werden unterschiedliche Farbmischmodelle verwendet. Beschreiben Sie die beiden Modelle! (4P)

- **RGB (additiv):** Bildschirme erzeugen Farben durch Addition von rotem, grünem und blauem Licht – aus keiner Farbe (Schwarz) wird durch Hinzufügen von Licht Weiß.
- **CMYK (subtraktiv):** Der Druck erzeugt Farben, indem Cyan-, Magenta-, Gelb- und Schwarztinte auf weißem Papier Licht absorbieren (subtrahieren) – aus vollem weißem Licht wird durch Farbauftrag die wahrgenommene Farbe "herausgefiltert".

> [!todo]
> (117) Was ist Fettes Schwarz und weshalb wird es verwendet? (2P)

Fettes Schwarz entsteht, indem zu 100 % K zusätzlich Anteile von C, M und Y gemischt werden. Es wird verwendet, weil reines K-Schwarz oft nicht tief/deckend genug wirkt, insbesondere bei großen Flächen – siehe [[4. Preprint#4.6.2 Druckkontrollstreifen|Druckkontrollstreifen]].

> [!todo]
> (118) Weshalb sollte bereits im Preprint das Druckmedium bekannt und in seinen Details abgestimmt sein? (3P)

Das Druckmedium (Papierart, -saugfähigkeit, -laufrichtung, Druckverfahren) beeinflusst Farbwiedergabe, Tonwertzunahme, Auflösungsanforderungen und das benötigte Ausschießschema – wird dies erst nach der Preprint-Phase klar, sind teure Nacharbeiten oder Fehldrucke die Folge.

> [!todo]
> (119) Bringen Sie den Ablauf in die richtige Reihenfolge: Digital Proof, Gut zum Druck, Ausrüstung, Zustellung von Belegen an Agentur, Maquettenexemplar für den Kunden, Druckabnahme an der Maschine. (4P)

Reihenfolge: Digital Proof → Gut zum Druck → Druckabnahme an der Maschine → Ausrüstung → Maquettenexemplar für den Kunden → Zustellung von Belegen an Agentur.

> [!todo]
> (120) Eine vom Kunden vorbereitete Broschüre (PDF-Vorlage) hat 18 Seiten. Welche Korrektur müssen Sie dem Kunden vorschlagen? (2P)

Da gängige Ausschießschemata (16-Seiter etc.) auf durch 4 teilbare Seitenzahlen basieren (Bogenfalzung), sollte dem Kunden vorgeschlagen werden, die Seitenzahl auf ein Vielfaches von 4 (hier z.B. 20 Seiten) anzupassen – z.B. durch Ergänzung leerer/zusätzlicher Seiten, damit kein unvollständig bedruckter Bogen entsteht.

> [!todo]
> (121) Welche Informationen müssen zwingend in einem PDF/X-4-Dokument enthalten sein? Markieren Sie die Pflichtinformationen in Abbildung 1! Zusatz: Geben Sie auch die Häufigkeiten der Pflichtinformationen an. (7P+1P)

![[Aufgaben Druckvorstufe/1-Andruckbogen-Druckmarken.jpeg]]

- Pflichtinformationen auf dem Andruckbogen (Abbildung 1) sind u.a. der eingebettete ICC-/Ausgabeprofilverweis, Passkreuze/Passermarken (je Ecke/Symmetrieachse, i.d.R. 4–8× pro Bogen), Farbkontrollstreifen (1× je Bogenrand), Schneid-/Falzmarken (je Schnitt-/Falzkante) sowie Dokumentinformationen (Dateiname, Datum, Farbigkeit) – üblicherweise einmalig am Bogenrand vermerkt.

> [!todo]
> (122) Was sind häufige Flüchtigkeitsfehler beim Erzeugen der Transferdatei?

Vergessenes Einbetten von Schriften, falscher/fehlender Farbraum (RGB statt CMYK), fehlender Anschnitt, falsche PDF/X-Konformität, sowie falsche Seitenreihenfolge oder -größe.

> [!todo]
> (123) Beim Ausschießen mehrseitiger Kataloge, Broschüren oder Bücher, die im Schön- und Widerdruck in zwei Formen produziert werden, wird zwischen der inneren und der äußeren Form unterschieden. Beschreiben Sie die äußere Form und die innere Form!

- **Äußere Form:** enthält die Seiten, die am Anfang und Ende des Falzbogens liegen (z.B. bei einem 16-Seiter die äußersten Seitenpaare).
- **Innere Form:** enthält die Seiten, die in der Mitte des Falzbogens liegen. Beide Formen zusammen ergeben nach dem Schön- und Widerdruck sowie dem Falzen die vollständige, korrekt sortierte Seitenfolge.

> [!todo]
> (124) Sie erstellen eine 52-seitige Broschüre mit 4 Umschlagseiten. Betrachten Sie die Tabelle 1 und entscheiden Sie dann, ob es sich um eine Rückstichbindung oder eine Klebebindung handelt. Begründen Sie Ihre Antwort!

| Tabelle 1: Beispiel einer Druckbogenfolge |       |              |       |              |       |       |              |
|--------------------------------------------|-------|--------------|-------|--------------|-------|-------|--------------|
| Druckbogen 1 |  | Druckbogen 2 |  | Druckbogen 3 |  |  | Druckbogen 4 |
| schön | wider | schön | wider | schön | wider | schön | wider |
|  |  | 3 | 4 | 11 | 12 | 19 | 20 |
|  |  | 6 | 5 | 14 | 13 | 22 | 21 |
|  |  |  | 8 | 15 | 16 | 23 | 24 |
|  | 2 | 10 | 9 | 18 | 17 | 26 | 25 |
| 52 | 51 | 44 | 43 | 35 | 36 | 27 | 28 |
|  |  | 46 | 45 | 38 | 37 | 30 | 29 |
|  |  | 47 | 48 | 39 | 40 | 31 | 32 |
|  |  | 50 | 49 | 42 | 41 | 34 | 33 |
| Seiten | | 16 Seiten | | 16 Seiten | | | 16 Seiten |

- Es handelt sich um eine **Klebebindung**, nicht um eine Rückstichbindung: Bei 52 Innenseiten + 4 Umschlagseiten verteilt auf mehrere separate 16-Seiten-Falzbogen (siehe Tabelle) werden die Lagen einzeln gefalzt und anschließend am Rücken zusammengeklebt. Eine Rückstichbindung (Heftklammern durch den gemeinsamen Falz) wäre bei dieser Bogenanzahl und -aufteilung in mehrere unabhängige Lagen technisch nicht sinnvoll bzw. nicht üblich – sie eignet sich nur für dünnere Produkte mit durchgehend ineinandergesteckten Lagen.

> [!todo]
> (125) Betrachten Sie den Einteilungsbogen in Abbildung 2. Geben Sie für jede grün hervorgehobene Eigenschaft an, wozu sie dient! (7P)

![[Aufgaben Druckvorstufe/2-Einteilungsbogen-Beispiel.jpeg]]

- **Passkreuz:** Kontrolle der exakten Farbdeckung (Register) mehrerer Druckdurchgänge.
- **Flattermarke:** Erkennung korrekter Bogensortierung/-reihenfolge.
- **Schneidmarke:** markiert die Position des finalen Beschnitts.
- **Falzmarke:** markiert die Position, an der der Bogen gefalzt wird.
- **Druckkontrollstreifen:** ermöglicht die Qualitätskontrolle je Farbkanal während des Drucks.
- **Bund/Kopf/Satzspiegel:** definieren die Ausrichtung und den nutzbaren Inhaltsbereich jeder Einzelseite auf dem Bogen.
- **Greiferrand:** der maschinenbedingt nicht bedruckbare Rand, an dem der Bogen durch die Druckmaschine transportiert (gegriffen) wird.

### 8.3 Eigenschaften des Druckmediums

> [!todo]
> (129) Weshalb ist eine Bogenberechnung und Nutzenberechnung in Abstimmung mit der Druckerei sinnvoll? (3P)

Die verfügbaren Rohbogenformate, Druckmaschinenformate und Greiferränder sind druckereispezifisch. Eine Abstimmung stellt sicher, dass die geplante Nutzenanzahl pro Bogen tatsächlich produzierbar ist und Papierverschnitt sowie Kosten minimiert werden.

> [!todo]
> (130) Ihre Druckerei betreibt eine SM 74-4 von Heidelberg. Das maximale Druckformat ist (51 × 74) cm². In der Regel haben Papierhändler dieses Format nicht vorrätig. Stattdessen gibt es sehr häufig Rohbögen im Format (70 × 100) cm². Auf welches Format sollten Sie Ihr Druckformat zuschneiden und was müssen Sie dabei beachten? (2P)

Der Rohbogen (70 × 100 cm) sollte auf **70 × 100 cm halbiert bzw. zugeschnitten auf ein Format innerhalb der maximalen 51 × 74 cm der Maschine** zugeschnitten werden – konkret bietet sich ein Zuschnitt auf z.B. 50 × 70 cm an (ein gängiges abgeleitetes Standardformat aus 70×100, das innerhalb von 51×74 cm liegt). Dabei ist die Laufrichtung des Papiers und ein ausreichender Greiferrand für die Maschine zu berücksichtigen.

> [!todo]
> (131) Nennen und beschreiben Sie zwei Einflussfaktoren der Bogen- und Nutzenberechnung! (4P)

- **Greiferrand:** ein maschinenbedingt nicht bedruckbarer Randstreifen, der von der nutzbaren Bogenfläche abgezogen werden muss.
- **Papierlaufrichtung:** bestimmt, wie die Nutzen auf dem Bogen orientiert werden müssen (stehend/liegend), um Falz- und Stabilitätsanforderungen des Endprodukts zu erfüllen – beeinflusst direkt, wie viele Nutzen ohne Qualitätsverlust auf den Bogen passen.

> [!todo]
> (132) Ein Kunde bestellt Werbekarte im Format DIN A5 hoch. Ihnen stehen Druckbögen (61 × 86) cm SB (Schmalbahn) zur Verfügung. Berechnen Sie: (8P)
> (a) Wie viele Nutzen ohne Zwischenschnitte können aus einem Druckbogen geschnitten werden, wenn 8mm Greiferkante (Sie wissen nicht, an welcher Kante gegriffen wird) und die Laufrichtung des Papiers zu berücksichtigen sind?
> (b) Wie viel Papierabfall fällt an?

- DIN A5 hoch = 14,8 × 21,0 cm. Da bei Schmalbahn (SB) die Laufrichtung parallel zur kurzen Bogenkante verläuft und nicht bekannt ist, an welcher Kante gegriffen wird, muss der Greiferrand (0,8 cm) sicherheitshalber von einer der 61-cm-Kanten abgezogen werden: nutzbare Fläche ≈ 60,2 × 86 cm.
- (a) In Laufrichtung (86 cm-Kante): 86 / 21,0 ≈ 4 Nutzen (84 cm genutzt); quer dazu (60,2 cm-Kante): 60,2 / 14,8 ≈ 4 Nutzen (59,2 cm genutzt). Es passen somit **4 × 4 = 16 Nutzen** ohne Zwischenschnitte auf den Bogen.
- (b) Bogenfläche: 61 × 86 = 5246 cm². Genutzte Fläche: 16 × (14,8 × 21,0) = 16 × 310,8 = 4972,8 cm². Papierabfall: 5246 − 4972,8 = **273,2 cm²** (zzgl. der bereits abgezogenen Greiferkante).

---
## Review & Learning
> [!summary] Zusammenfassung
> Dieses Übungsblatt deckt den gesamten Preprint-Workflow ab: Scan (Auflösung, Moiré, Bit-Tiefe), Retusche (destruktiv/non-destruktiv, Frequenztrennung), Satzherstellung (Satzarten, Mikrotypografie), Layouten (Raster, Weißraum, Hierarchie), Ausschießen (Falzschemata, Bund, Register), Druckvorlage (PDF/X, Farbmanagement, Preflight) und Druckformerstellung (CTP, Rasterung, Tonwertzunahme). Die Prüfungsvorbereitungsaufgaben verbinden diese Konzepte mit praktischen Berechnungen zu Bogen- und Nutzenaufteilung.

> [!question] Mögliche Prüfungsfragen
> - Erklären Sie den Unterschied zwischen optischer und interpolierter Auflösung sowie deren Bedeutung für den Scan-Prozess.
> - Warum wird bei der Retusche mit Frequenztrennung gearbeitet und welches Problem löst sie?
> - Was unterscheidet Hurenkinder von Schusterjungen im Satzbild?
> - Welche Rolle spielt der Beschnitt im Layout und warum ist er notwendig?
> - Was ist der Unterschied zwischen Schöndruck und Widerdruck beim Ausschießen?
> - Welche Anforderungen unterscheiden PDF/X-1a von PDF/X-4?
> - Wie entsteht "fettes Schwarz" und wofür wird es eingesetzt?
> - Berechnen Sie die Nutzenanzahl eines gegebenen Bogenformats für ein gegebenes Endformat unter Berücksichtigung von Greiferrand und Laufrichtung.
