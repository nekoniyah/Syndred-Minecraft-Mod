#!/bin/bash
# cd /home/nekoniyah/MCreatorWorkspaces/syndred/

BRANCH="master"
git pull --no-rebase origin main

git add -A
git commit -m "Auto-sync: $(date +'%Y-%m-%d %H:%M:%S')"

git rebase --abort 2>/dev/null
git merge --abort 2>/dev/null

git add -A
git commit -m "Auto-sync: $(date +'%Y-%m-%d %H:%M:%S')"

git push origin master -f
