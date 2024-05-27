#!/bin/bash

# Variables
BRANCH="main"             # The branch you want to push changes to
COMMIT_MESSAGE="Your commit message here"   # Default commit message
TAG=""                    # The tag to create (default is empty, meaning no tag will be created)
REMOTE="origin"           # The remote repository name

# Functions
print_usage() {
    echo "Usage: $0 [-m <commit-message>] [-t <tag>] [-b <branch>]"
    echo "  -m <commit-message>  Commit message (default: 'Your commit message here')"
    echo "  -t <tag>             Tag to create (if not provided, no tag will be created)"
    echo "  -b <branch>          Branch to push changes to (default: 'main')"
}

# Parse command line arguments
while getopts "m:t:b:" opt; do
    case ${opt} in
        m )
            COMMIT_MESSAGE=$OPTARG
            ;;
        t )
            TAG=$OPTARG
            ;;
        b )
            BRANCH=$OPTARG
            ;;
        \? )
            print_usage
            exit 1
            ;;
    esac
done

# Ensure we are on the correct branch
git checkout $BRANCH

# Add changes to git.
git add .

# Commit changes.
git commit -m "$COMMIT_MESSAGE"

# Push changes to the remote repository.
git push $REMOTE $BRANCH

# Create a new tag if the -t option was provided.
if [ -n "$TAG" ]; then
    git tag -a $TAG -m "$COMMIT_MESSAGE"
    git push $REMOTE $TAG
    echo "Tag '$TAG' has been created and pushed to remote."
else
    echo "No tag created."
fi

echo "Changes have been committed and pushed to branch '$BRANCH'."
