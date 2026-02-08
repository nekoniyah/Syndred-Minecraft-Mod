#!/bin/bash
# cd /home/nekoniyah/MCreatorWorkspaces/syndred/

BRANCH="master"
git pull --no-rebase origin master

git add -A
git commit -m "Auto-sync: $(date +'%Y-%m-%d %H:%M:%S')"

git rebase --abort 2>/dev/null
git merge --abort 2>/dev/null

git add -A
git commit -m "Auto-sync: $(date +'%Y-%m-%d %H:%M:%S')"

<<<<<<< HEAD
git push origin master -f
=======
git push origin master
>>>>>>> 490269c6eddf9cdc5a98fa119d7a7eb6f39c3c2a
