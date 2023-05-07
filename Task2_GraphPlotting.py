
import numpy as np
import matplotlib.pyplot as plt

data = np.loadtxt('data.txt')

fig, axs = plt.subplots(2, 2, figsize=(10, 8)) # creating subplots

axs[0, 0].plot(data[:, 0], data[:, 1], 'b')
axs[0, 0].set_xlabel('Time')
axs[0, 0].set_ylabel('Data 1')

axs[0, 1].plot(data[:, 0], data[:, 2], 'y')
axs[0, 1].set_xlabel('Time')
axs[0, 1].set_ylabel('Data 2')

axs[1, 0].plot(data[:, 0], data[:, 3], 'r')
axs[1, 0].set_xlabel('Time')
axs[1, 0].set_ylabel('Data 3')

axs[1, 1].plot(data[:, 0], data[:, 4], 'g')
axs[1, 1].set_xlabel('Time')
axs[1, 1].set_ylabel('Data 4')

fig.suptitle('Static graph plotting')

plt.show() # displaying the subplots






