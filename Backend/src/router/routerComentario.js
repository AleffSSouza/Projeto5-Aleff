const { Router } = require("express");
const ComentarioController = require("../controller/ComentarioController");
const { validateComentario, validateComentarioId } = require("../middlewares/ValidateComentario");

const router = Router();

// Rota para criar um novo comentário
router.post('/', validateComentario, (req, res) => {
    ComentarioController.create(req, res);
});

// Rota para obter todos os comentários (com suporte para postId)
router.get('/', (req, res) => {
    ComentarioController.getAll(req, res);
});

// Rota para atualizar um comentário existente
router.put('/:id', validateComentario, validateComentarioId, (req, res) => {
    ComentarioController.update(req, res);
});

// Rota para obter um comentário específico
router.get('/:id', validateComentarioId, (req, res) => {
    ComentarioController.getOne(req, res);
});

// Rota para deletar um comentário
router.delete('/:id', validateComentarioId, (req, res) => {
    ComentarioController.delete(req, res);
});

module.exports = router;