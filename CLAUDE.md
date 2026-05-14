
This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an **Obsidian vault** containing university lecture notes (DHSN — Duale Hochschule Sachsen). Notes are written in Markdown with Obsidian-flavored syntax (`[[wikilinks]]`, callouts, LaTeX math via `$$`).

## Structure

- `wiki/SEM{n}/` — notes organized by semester, each subject in its own folder
- Subject folders follow the pattern `{emoji} {KÜRZEL}/` (e.g. `🖥️ IMPP/`, `🧮 MAA/`)
- Each subject folder has an index file named identically to the folder (e.g. `🧮 MAA.md`) listing all topic pages
- `images/` — embedded images and media referenced from notes
- `raw/` — staging area for unprocessed files
- `.claude/commands/` — Claude Code custom slash commands
  - **`/sync`** — Hauptcommand: verarbeitet Rohmaterialien aus `raw/`, legt neue Fächer an, erstellt/aktualisiert Notizen, setzt Verlinkungen, räumt auf und committet

## Conventions

- **Language**: All notes and commit messages are in **German**
- **LaTeX math**: Notes use `$...$` for inline and `$$...$$` for block math extensively
- **Wikilinks**: Internal links use Obsidian's `[[Page Name]]` syntax, not standard Markdown links
- Subject abbreviations are uppercase (IMPP, MAA, TGI, MG)
- Topic files are numbered sequentially (e.g. `1. Variablen.md`, `2. Gleitkommazahlen.md`)

## Marker Import Best Practices

- **OCR-Cleanup:** Beim Import von Marker-Outputs immer nach `$\bullet$`-Artefakten, doppelten Leerzeichen und redundanten Kopf-/Fußzeilen (z.B. wiederholte Fachnamen) scannen und diese entfernen.
- **Hierarchie:** Flache Hierarchien (1.1 bis 1.60) vermeiden; stattdessen thematisch unter `## {N}.X` gruppieren.

## Workflow

1. Rohmaterialien (PDFs, Fotos, Textdateien) in `raw/` ablegen
2. `/sync` ausführen — optional mit Kontext in natürlicher Sprache (z.B. `/sync Das sind MAA-Vorlesungen`)
3. Der Skill verarbeitet alles automatisch: liest Dateien, erstellt Notizen, aktualisiert Indizes, setzt Querverweise, räumt `raw/` auf und erstellt einen Git-Commit

## Best Practices entwickeln und dokumentieren

Wenn während der Arbeit neue Best Practices entdeckt werden (z.B. "Mermaid-Charts sind besser als ASCII-Diagramme"), sollen diese direkt in die Sync-Commands geschrieben werden:

- `.claude/commands/sync.md` — für Claude Code
- `.opencode/skills/sync.md` — für OpenCode

So werden Erkenntnisse automatisch für zukünftige Sync-Läufe angewendet.

Siehe auch `AGENTS.md` für die gemeinsame Dokumentation aller Best Practices.