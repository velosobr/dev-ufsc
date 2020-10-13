cmake_minimum_required(VERSION 3.17)
project(Threads C)

set(CMAKE_C_STANDARD 99)

add_executable(Threads main.c fork1.c)