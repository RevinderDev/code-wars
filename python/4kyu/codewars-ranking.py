# TODO: create the User class
# it must support rank, progress, and the inc_progress(rank) method
import math

class User:
    
    MAX_PROGRESS = 100
    MAX_RANK = 8
    MIN_RANK = -8
    RANKS = [i for i in range(MIN_RANK, MAX_RANK + 1) if i != 0]
    
    def __init__(self):
        self.progress = 0
        self.rank = User.RANKS[0]
        
    @staticmethod
    def validate_rank(rank):
        if rank not in User.RANKS:
            raise ValueError('Invalid rank')
        
    def inc_progress(self, solved_kata_rank):
        User.validate_rank(solved_kata_rank)
        if User.RANKS.index(self.rank) == User.RANKS.index(solved_kata_rank):
            self.update_progress(made_progress=3)
        elif User.RANKS.index(self.rank) - 1 == User.RANKS.index(solved_kata_rank):
            self.update_progress(made_progress=1)
        elif User.RANKS.index(self.rank) - 2 > User.RANKS.index(solved_kata_rank):
            return
        elif User.RANKS.index(self.rank) == -1 and User.RANKS.index(solved_kata_rank) == 1:
            self.update_progress(made_progress=10)
        elif User.RANKS.index(self.rank) < User.RANKS.index(solved_kata_rank):
            difference = abs(User.RANKS.index(solved_kata_rank) - User.RANKS.index(self.rank))
            self.update_progress(10 * difference * difference)
        if self.rank == User.MAX_RANK:
            self.progress = 0
        return
        
    def update_progress(self, made_progress):
        self.progress += made_progress
        while self.progress >= User.MAX_PROGRESS:
            if self.rank == User.MAX_RANK:
                break
            current_rank_idx = User.RANKS.index(self.rank)
            self.rank = User.RANKS[current_rank_idx + 1]
            self.progress -= User.MAX_PROGRESS