
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