@echo off
set BRANCH=master

echo 🚀 Starting Windows MCreator Sync...

:: 1. Clear any stuck rebases or merges
git rebase --abort >nul 2>&1
git merge --abort >nul 2>&1

:: 2. Ensure we are on master
git checkout %BRANCH%

:: 3. Stage and commit
git add -A
git commit -m "Auto-sync (Windows): %date% %time%"

:: 4. Pull and favor local changes in case of conflict
echo 📥 Pulling updates from GitHub...
git pull origin %BRANCH% --rebase -X ours

:: 5. Push
echo 📤 Pushing changes...
git push origin %BRANCH%

echo ✨ Sync complete!
pause
