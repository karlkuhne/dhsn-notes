# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an **Obsidian vault** containing university lecture notes (DHSN — Duale Hochschule Sachsen). Notes are written in Markdown with Obsidian-flavored syntax (`[[wikilinks]]`, callouts, LaTeX math via `$$`).

## Structure

- `wiki/SEM{n}/` — notes organized by semester, each subject in its own folder
- Subject folders follow the pattern `{emoji} {KÜRZEL}/` (e.g. `🖥️ IMPP/`, `🧮 MAA/`)
- Each subject folder has an index file named identically to the folder (e.g. `🧮 MAA.md`) listing all topic pages
- `images/` — embedded images and media referenced from notes
- `raw/` — staging area for unprocessed files
- `claude/commands/` — Claude Code custom slash commands

## Conventions

- **Language**: All notes and commit messages are in **German**
- **LaTeX math**: Notes use `$...$` for inline and `$$...$$` for block math extensively
- **Wikilinks**: Internal links use Obsidian's `[[Page Name]]` syntax, not standard Markdown links
- Subject abbreviations are uppercase (IMPP, MAA, TGI, MG)
- Topic files are numbered sequentially (e.g. `1. Variablen.md`, `2. Gleitkommazahlen.md`)

## MCP Tools: code-review-graph

**IMPORTANT: This project has a knowledge graph. ALWAYS use the
code-review-graph MCP tools BEFORE using Grep/Glob/Read to explore
the codebase.** The graph is faster, cheaper (fewer tokens), and gives
you structural context (callers, dependents, test coverage) that file
scanning cannot.

### When to use graph tools FIRST

- **Exploring code**: `semantic_search_nodes` or `query_graph` instead of Grep
- **Understanding impact**: `get_impact_radius` instead of manually tracing imports
- **Code review**: `detect_changes` + `get_review_context` instead of reading entire files
- **Finding relationships**: `query_graph` with callers_of/callees_of/imports_of/tests_for
- **Architecture questions**: `get_architecture_overview` + `list_communities`

Fall back to Grep/Glob/Read **only** when the graph doesn't cover what you need.

### Key Tools

| Tool | Use when |
|------|----------|
| `detect_changes` | Reviewing code changes — gives risk-scored analysis |
| `get_review_context` | Need source snippets for review — token-efficient |
| `get_impact_radius` | Understanding blast radius of a change |
| `get_affected_flows` | Finding which execution paths are impacted |
| `query_graph` | Tracing callers, callees, imports, tests, dependencies |
| `semantic_search_nodes` | Finding functions/classes by name or keyword |
| `get_architecture_overview` | Understanding high-level codebase structure |
| `refactor_tool` | Planning renames, finding dead code |
