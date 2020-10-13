//#include <stdio.h>
//#include <stdlib.h>
//#include <pthread.h>
//
//#define NUM_THREADS 5
//
//// funcao que recebe outra funcao por parametro
//void *print_hello(void *threadId) {
//    long tId;
//    tId = (long) threadId;
//    printf("Hello World! It's me, thread #%ld!\n", tId);
//    pthread_exit(NULL);
//}
//
//int main(int argc, char *argv[]) {
//
//    pthread_t threads[NUM_THREADS];
//
//    int returnCode;
//    long thread;
//
//    for (thread = 0; thread < NUM_THREADS; thread++) {
//        printf("In main: creating thread %ld\n", thread);
//        returnCode = pthread_create(&threads[thread], NULL, print_hello, (void *) thread);
//
//        if (returnCode) {
//            printf("ERROR; return code from pthread_create() is %d\n", returnCode);
//            exit(-1);
//        }
//    }
//
//    for (thread = 0; thread < NUM_THREADS; thread++) {
//        pthread_join(threads[i], NULL);
//    }
//    pthread_exit(NULL);
//
//
//}
